package Task4.Calculation;

public class Student {
    private String name;
    private String surname;
    private String curriculum;
    private String input;

    public Student(String name, String surname, String curriculum,String input ){
        this.name = name;
        this.surname = surname;
        this.curriculum = curriculum;
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append(name).append(' ').append(surname).append(' ').append(curriculum).append(" ");
        sb.append(' ');
        return sb.toString();
    }
}
