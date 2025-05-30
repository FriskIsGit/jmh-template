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

### Modifying the benchmark
The method annotated with `@Benchmark` in [Experiment.java](src/bench/Experiment.java) is the tested method.
[ExperimentRunner.java](src/bench/ExperimentRunner.java) is program's entry point where you can modify parameters like
the number of forks, measurement time, warmup iterations etc.



### Maven
This template includes **Maven wrapper**, `mvnw` and `mvnw.cmd` wrapper scripts.
`mvnw.cmd` was modified to prevent a powershell syntax error tied to `maven-wrapper.jar` download (if it's missing).