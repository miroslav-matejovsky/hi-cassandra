package sk.bsmk.hi.cassandra;

import com.github.nosan.embedded.cassandra.api.Cassandra;
import com.github.nosan.embedded.cassandra.api.connection.CassandraConnection;
import com.github.nosan.embedded.cassandra.api.cql.CqlDataSet;
import com.github.nosan.embedded.cassandra.junit5.test.CassandraExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class CassandraExamples {

    @RegisterExtension
    static final CassandraExtension CASSANDRA_EXTENSION = new CassandraExtension()
            .withCqlDataSet(CqlDataSet.ofClasspaths("schema.cql"));

    @Test
    void test() {
        Cassandra cassandra = CASSANDRA_EXTENSION.getCassandra();
        CassandraConnection cassandraConnection = CASSANDRA_EXTENSION.getCassandraConnection();
    }

}
