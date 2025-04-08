@echo off

call ./mvnw clean install

echo Running JAR!
java -jar target/benchmark-1.jar

@echo on
