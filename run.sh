#!/bin/sh

./mvnw clean install

echo Running JAR!
java -jar target/benchmark-1.jar
