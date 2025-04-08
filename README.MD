# JMH template
This is a minimal, ready-to-use project for benchmarking with JMH - https://github.com/openjdk/jmh.

### Steps
```sh
git clone https://github.com/FriskIsGit/JMH-template
```
```sh
./mvnw clean install
```
```sh
java -jar target/benchmark-1.jar
```

### Maven
This template includes **Maven wrapper**, `mvnw` and `mvnw.cmd` wrapper scripts.
`mvnw.cmd` was modified to prevent a powershell syntax error tied to `maven-wrapper.jar` download (if it's missing).