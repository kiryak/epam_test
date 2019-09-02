package Task4.Calculation;

public class Student {
    private String name;
    private String surname;
    private String curriculum;
    private String input1 = "01.09.2019";
    private String input2 = "10.08.2019";

    public String getInput1() {
        return input1;
    }

    public String getInput2() {
        return input2;
    }

    public Student(String name, String surname, String curriculum) {
        this.name = name;
        this.surname = surname;
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append(name).append(' ').append(surname).append(' ').append(curriculum).append(" ");
        sb.append(' ');
        return sb.toString();
    }
}
