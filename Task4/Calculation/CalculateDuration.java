package Task4.Calculation;
import Task4.Curriculum.Group;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class CalculateDuration {
    private int sum1;
    private int sum2;
    private Duration duration1 = Duration.of(getSum1(),ChronoUnit.DAYS);;
    private Duration duration2 = Duration.of(getSum2(),ChronoUnit.DAYS);;


    public Duration getDuration1() {
        return duration1;
    }

    public Duration getDuration2() {
        return duration2;
    }

    public int getSum1() {
        Group.JavaDeveloper.setAmount(Group.Type.JAVA_TECHNOLOGIES.getAmount()+ Group.Type.JDBC.getAmount()+Group.Type.JFC_SWING.getAmount());
        int sum1 = Group.JavaDeveloper.getAmount();
        return sum1;
    }

    public int getSum2() {
        Group.J2EEDeveloper.setAmount(Group.Type.STRUTS_FRAMEWORK.getAmount()+ Group.Type.JAVA_SERVLETS.getAmount());
        int sum2 = Group.J2EEDeveloper.getAmount();
        return sum2;
    }
}
