package Task6;

import Task6.SubTask1.Application1;
import Task6.SubTask2.Application2;
import Task6.SubTask3.Application3;
import Task6.SubTask4.Application4;
import Task6.SubTask5.Application5;


public class Main {
    public static void main(String[] args) {
        Application1 task1 = new Application1();
        Application2 task2 = new Application2();
        Application3 task3 = new Application3();
        Application4 task4 = new Application4();
        Application5 task5 = new Application5 ();
        task1.main();
        task2.main();
        task3.main();
        task4.main();
        task5.main();
    }
}
