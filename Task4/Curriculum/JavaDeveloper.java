package Task4.Curriculum;

import java.time.Duration;

public class JavaDeveloper {
    private Duration duration;
    JavaTechnologies javaCourse1 = new JavaTechnologies();
    JFC_String javaCourse2 = new JFC_String();
    JDBC javaCourse3 = new JDBC();

    public Duration getDuration() {
        duration = javaCourse1.getDuration().plus(javaCourse2.getDuration()).plus(javaCourse3.getDuration());
        return duration;
    }
}
