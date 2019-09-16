package Task6.SubTask3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedList {

    public void getList (String pathname){
        try {
            Scanner scanner = new Scanner(new File(pathname));
            ArrayList<String> list = new ArrayList<>();

            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }
            scanner.close();
            Collections.sort(list, java.util.Comparator.comparing(String::length));

            for (String string : list) {
                System.out.println(string);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Check whether the file exists");
        }
    }
}
