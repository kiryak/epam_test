package Task1;

import java.util.Scanner;

//Mariia Palyga
//Lesson 1, Task 2
public class Strings {
    public static void main(String[] args) {
        Strings strings = new Strings ();
        strings.startTest1();
        strings.startTest2();
        strings.startTest3();
        strings.startTest4();
        strings.startTest5();
        strings.startTest6();
    }

    public void startTest1 (){
        int indexMin = 0;
        int indexMax = 0;
        int n = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number of lines");
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
        }
        else {
            System.out.println("Invalid input. Please, enter the number of lines.");
            startTest1();
        }
            String[] arrayOfStrings = new String[n];
        System.out.println("Enter the lines");
           for (int i = 0; i < n; i++) {
                   arrayOfStrings[i] = scanner.next();
                   if (arrayOfStrings[i].length() < arrayOfStrings[indexMin].length()) {
                       indexMin = i;
                   }
                   if (arrayOfStrings[i].length() > arrayOfStrings[indexMax].length()){
                       indexMax = i;
                   }}
               System.out.println("The shortest line is " + arrayOfStrings[indexMin]);
               System.out.println("The longest line is " + arrayOfStrings[indexMax]);
        }

    public void startTest2 () {
        int indexLong = 0;
        int sum = 0;
        int averageLength = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please, enter the number of lines.");
            startTest2();
        }
        String[] arrayOfStrings = new String[n];
        System.out.println("Enter the lines");
        for (int i = 0; i < n; i++) {
            arrayOfStrings[i] = scanner.next();
            sum += arrayOfStrings[i].length();
            averageLength = sum / n;
        }
        for (int i = 0; i < n; i++) {
            if (arrayOfStrings[i].length() > averageLength) {
                indexLong = i;
                System.out.println("The line with the length above average: " + arrayOfStrings[indexLong]);
                System.out.println("The length is: " + arrayOfStrings[indexLong].length() + " letters");
            }
        }
    }

    public void startTest3 () {
        int indexShort = 0;
        int sum = 0;
        int averageLength = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please, enter the number of lines.");
            startTest3();
        }
        String[] arrayOfStrings = new String[n];
        System.out.println("Enter the lines");
        for (int i = 0; i < n; i++) {
            arrayOfStrings[i] = scanner.next();
            sum += arrayOfStrings[i].length();
            averageLength = sum / n;
        }
        for (int i = 0; i < n; i++) {
            if (arrayOfStrings[i].length() < averageLength) {
                indexShort = i;
                System.out.println("The line with the length below average: " + arrayOfStrings[indexShort]);
                System.out.println("The length is: " + arrayOfStrings[indexShort].length() + " letters");
            }
        }
    }

    public void startTest4 (){
        int n = 0;
        String text;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number of words");
        if (scan.hasNextInt ()) {
            n = Integer.parseInt (scan.nextLine ());
        }
        else {
            System.out.println("Invalid input. Please, enter the number of words.");
            startTest4();}
        System.out.println("Enter the text");
        text = scan.nextLine ();
        int [] countChars = new int[n];
        String minWord = "";
        String maxWord= "";
        int min = Integer.MAX_VALUE;
        for (String word : text.split (" ", n)) { //splitting line in words
            String test = "";
            for (int i = 0; i < word.length(); i++) {
                if (test.indexOf(word.charAt(i)) == -1) {
                    test = test + word.charAt(i);
                }
            }
            if (test.length() < min) {
                min = test.length();}
            if (word.length()>maxWord.length()){
                maxWord= word;} else {minWord = word;}
            if (minWord.length()<maxWord.length() && minWord.length()== min) {
                minWord = word;
                System.out.println("The word with minimum number of unique characters: " + minWord);
                System.out.println("The number of characters: " + min);

            }
        }}

    public void startTest5 () {
        int n = 0; //number of lines
        String text;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number of words");
        if (scan.hasNextInt ()) {
            n = Integer.parseInt (scan.nextLine ());
        }
        else {
            System.out.println("Invalid input. Please, enter the number of words.");
            startTest5();}
        System.out.println("Enter the text");
        text = scan.nextLine ();
        for (String word : text.split (" ", n)) { //splitting line in words
            String test = "";
            for (int i = 0; i < word.length(); i++) {
                if (test.indexOf(word.charAt(i)) == -1) {
                    test = test + word.charAt(i);
                    if (test.length()==word.length())
                        System.out.println(word);
                }
            }
        }
    }


    public void startTest6 () {
        int n = 0; //number of lines
        int count = 0; //counting duplicates
        String text;
        String regex = "[0-9]+";
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number of words");
        if (scan.hasNextInt ()) {
            n = Integer.parseInt (scan.nextLine ());
        }
        else {
            System.out.println("Invalid input. Please, enter the number of words.");
            startTest6();}
        System.out.println("Enter the text");
        text = scan.nextLine ();
        for (String word : text.split (" ", n)){ //splitting line in words
            if( word.matches(regex)) {
                ++count;
            }
            if( word.matches(regex) && count==2) {
                System.out.println("Second word with numbers only: " + word);
            }}}}
