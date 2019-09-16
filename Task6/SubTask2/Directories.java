package Task6.SubTask2;

import java.io.File;
import java.util.ArrayList;


public class Directories {

    static ArrayList <File> directories = new ArrayList<>();

    public void getDirectories(String pathname){
        File directory = new File(pathname);
         if(directory.isDirectory())
    {
        for(File item : directory.listFiles()){
directories.add(item);
            }
        }
        System.out.println(directories);
    }
}
