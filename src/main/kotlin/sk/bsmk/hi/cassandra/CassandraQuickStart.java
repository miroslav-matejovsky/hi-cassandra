package sk.bsmk.hi.cassandra;

import com.github.nosan.embedded.cassandra.EmbeddedCassandraFactory;
import com.github.nosan.embedded.cassandra.api.Cassandra;
import com.github.nosan.embedded.cassandra.api.connection.CassandraConnection;
import com.github.nosan.embedded.cassandra.api.connection.DefaultCassandraConnectionFactory;
import com.github.nosan.embedded.cassandra.api.cql.CqlDataSet;

public class CassandraQuickStart {

    public static void main(String[] args) {
        EmbeddedCassandraFactory cassandraFactory = new EmbeddedCassandraFactory();
        Cassandra cassandra = cassandraFactory.create();
        cassandra.start();
        DefaultCassandraConnectionFactory cassandraConnectionFactory = new DefaultCassandraConnectionFactory();
        try (CassandraConnection connection = cassandraConnectionFactory.create(cassandra)) {
            CqlDataSet.ofClasspaths("schema.cql").forEachStatement(connection::execute);
        }
        finally {
            cassandra.stop();
        }
    }

}
