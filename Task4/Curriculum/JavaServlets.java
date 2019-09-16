package Task4.Curriculum;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class JavaServlets implements Course {
    private Duration duration = Duration.of(16/8,ChronoUnit.DAYS);

    public Duration getDuration() {
        return duration;
    }
}
