If the application is started by command
```sh
 java -jar target/slow-by-liquibase-0.0.1-SNAPSHOT.jar
```
It takes 9 seconds
> Started DemoApplication2 in 9.31 seconds (JVM running for 9.948)

If the application is started by command
```sh
mvn spring-boot:run
```
It is much sorter
> Started DemoApplication2 in 1.437 seconds (JVM running for 4.188)

It is caused by liquibase classpath scanning. If the application is started by command
```sh
 java -Dliquibase.scan.packages=liquibase.change,liquibase.changelog,liquibase.database,liquibase.parser,liquibase.precondition,liquibase.datatype,liquibase.serializer,liquibase.sqlgenerator ,liquibase.executor,liquibase.snapshot,liquibase.logging,liquibase.diff,liquibase.structure,liquibase.structurecompare,liquibase.lockservice,liquibase.sdk.database,liquibase.ext -jar target/slow-by-liquibase-0.0.1-SNAPSHOT.jar
 ```
 It is quick
> Started DemoApplication2 in 1.881 seconds (JVM running for 2.532)
