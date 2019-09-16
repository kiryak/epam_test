package Task6.SubTask1;

import java.util.Collections;
import java.util.List;

public class Reversed {
    Input input = new Input();
    public List<String> getReversed (){
        Collections.reverse(input.listOfStrings);
        return input.listOfStrings;
    }
}

