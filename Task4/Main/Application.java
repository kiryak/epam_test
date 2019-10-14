package Task4.Main;

import Task4.Calculation.Calculation;
import Task4.Curriculum.Developer;
import Task4.Curriculum.Group;
import Task4.Curriculum.J2EEDeveloper;
import Task4.Curriculum.JavaDeveloper;

public class Application {

    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.addCourse(new JavaDeveloper(Group.Type.JAVA_TECHNOLOGIES));
        developer.addCourse(new JavaDeveloper( Group.Type.JDBC));
        developer.addCourse(new JavaDeveloper(Group.Type.JFC_SWING));
        developer.addCourse(new J2EEDeveloper(Group.Type.STRUTS_FRAMEWORK));
        developer.addCourse(new J2EEDeveloper(Group.Type.JAVA_SERVLETS));


        Calculation calculation = new Calculation();
        calculation.getResult1();
        calculation.getResult2();

    }
}
