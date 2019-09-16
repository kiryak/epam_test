package Task6.SubTask5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Text {

    public void getUniqueWords (String pathname){
        try {
        Scanner scanner = new Scanner(new File(pathname));
            String text = scanner.useDelimiter("\\A").next();
            scanner.close();
    String [] words = text.split("[-!~.,()\\s]+");
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
            System.out.println(uniqueWords);}
        catch (FileNotFoundException e){
        e.printStackTrace();
        System.out.println("Check whether the file exists");
    }
    }
}
