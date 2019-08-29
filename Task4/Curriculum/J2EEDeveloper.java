package Task4.Curriculum;

import java.time.Duration;

public class J2EEDeveloper {
    private Duration duration;
    JavaServlets j2eedCourse1 = new JavaServlets();
    StrutsFramework j2eedCourse2 = new StrutsFramework();

    public Duration getDuration() {
        duration = j2eedCourse1.getDuration().plus(j2eedCourse2.getDuration());
        return duration;
    }
}
