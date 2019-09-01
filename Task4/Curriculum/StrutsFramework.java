package Task4.Curriculum;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class StrutsFramework {
    private Duration duration = Duration.of(24, ChronoUnit.HOURS);

    public Duration getDuration() {
        return duration;
    }
}
