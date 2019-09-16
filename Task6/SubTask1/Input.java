package Task6.SubTask1;

import javax.management.StringValueExp;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Input {
   static List<String> listOfStrings = new ArrayList<>();

    public List <String> readFile(String pathname) {
        try {
           Scanner scanner = new Scanner(new File(pathname));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                listOfStrings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Check whether the file exists");
        }
        return listOfStrings;
   }
}

/* System.out.println("Please, give a pathname for a file");
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()){
                String path = scanner.toString();
            Scanner scanner1 = new Scanner(new File((path)));*/

