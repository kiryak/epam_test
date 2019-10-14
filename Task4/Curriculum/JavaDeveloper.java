package Task4.Curriculum;
import java.time.Duration;
public class JavaDeveloper implements Course {

    private Duration duration;
    Group.Type type;

    public JavaDeveloper(Group.Type type) {
        this.type = type;
    }
    public Group.Type getType() {
        return type;
    }

}

