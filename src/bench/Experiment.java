package bench;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class Experiment {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd:HH:mm:ss")
            .withZone(ZoneId.systemDefault());

    @Setup
    public void setup() {
        // Prepare benchmark
    }
    
    @Benchmark
    public void benchmarkedMethod(Blackhole bh) {
        Instant now = Instant.now();
        String format = formatter.format(now);
    }

}