package Task6.SubTask1;

import java.io.FileWriter;

public class Output {
    Input input = new Input();

    public void getOutput (String pathname2){
        try {
            FileWriter writer = new FileWriter(pathname2);
            for(String string: input.listOfStrings) {
                writer.write(string + System.lineSeparator());
            }
            writer.close();
        }
        catch (java.io.IOException e){
            e.printStackTrace();
        }
    }
}
