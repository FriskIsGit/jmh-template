package bench;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class ExperimentRunner {
    public static void main(String[] args) {
        final int FORKS = 1;
        final int WARMUP_ITERATIONS = 3;

        Options options = new OptionsBuilder()
                .include(Experiment.class.getSimpleName())
                .forks(FORKS)
                .warmupIterations(WARMUP_ITERATIONS)
                .build();

        try {
            new Runner(options).run();
        } catch (org.openjdk.jmh.runner.RunnerException e) {
            throw new RuntimeException(e);
        }
    }
}
