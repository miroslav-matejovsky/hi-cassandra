---

# Cassandra

- [Apache](http://cassandra.apache.org/)
- [Wikipedia](https://en.wikipedia.org/wiki/Apache_Cassandra)
- Column data store

---

## Data distribution

- [link](https://dzone.com/articles/an-introduction-to-apache-cassandra#how-apache-cassandra-distributes-data)
- no single point of failure
- token ranges are distributes across nodes
- token is created by row partition key 


--- 

## Modeling

- [link](http://adamhutson.com/posts/) 
- each row has partition key
- column family is roughly represented as `Map<ParitionKey, SortedMap<ColumnKey, ColumnValue>>`

---

## CQL


