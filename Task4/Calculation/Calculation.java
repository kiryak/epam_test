package Task4.Calculation;

import Task4.Curriculum.J2EEDeveloper;
import Task4.Curriculum.JavaDeveloper;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Calculation {
    J2EEDeveloper j2eeDeveloper = new J2EEDeveloper();
    JavaDeveloper javaDeveloper = new JavaDeveloper();
    Student student1 = new Student("Ivan", "Ivanov", "J2EEDeveloper");
    Student student2 = new Student("Petr","Petrov","Java Developer");
    LocalDateTime dateOfStart1;
    LocalDateTime dateOfStart2;

    public void getResult1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            dateOfStart1 = LocalDate.parse(student1.getInput1(), formatter).atTime(11, 20);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format exception. Please insert the date in the format dd.mm.yyyy");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                student1.setInput1(scanner.nextLine());
                getResult1();
            }}
            LocalDateTime dateNow = LocalDateTime.now();
            LocalDateTime sum = dateOfStart1.plus(j2eeDeveloper.getDuration());

            LocalDateTime temporal = LocalDateTime.from(dateOfStart1);
            temporal = temporal.plus(j2eeDeveloper.getDuration());

            long years = temporal.until(dateNow, ChronoUnit.YEARS);
            temporal = temporal.plusYears(years);

            long months = temporal.until(dateNow, ChronoUnit.MONTHS);
            temporal = temporal.plusMonths(months);

            long days = temporal.until(dateNow, ChronoUnit.DAYS);
            temporal = temporal.plusDays(days);

            long hours = temporal.until(dateNow, ChronoUnit.HOURS);
            temporal = temporal.plusHours(hours);

            long minutes = temporal.until(dateNow, ChronoUnit.MINUTES);
            temporal = temporal.plusMinutes(minutes);

            long seconds = temporal.until(dateNow, ChronoUnit.SECONDS);
            if (temporal.compareTo(sum) < 0) {
                System.out.println(student1.toString() + "Обучение не закончено. До окончания обучения осталось " + (-years) + " years " +
                        (-months) + " months " +
                        (-days) + " days " +
                        (-hours) + " hours " +
                        (-minutes) + " minutes " +
                        (-seconds) + " seconds ");
            } else {
                System.out.println(student2.toString() + "Обучение закончено  " + years + " years " +
                        months + " months " +
                        days + " days " +
                        hours + " hours " +
                        minutes + " minutes " +
                        seconds + " seconds назад");

            }
        }


    public void getResult2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
        dateOfStart2 = LocalDate.parse(student2.getInput2(), formatter).atTime(8,56);}
        catch (DateTimeParseException e){
            System.out.println("Invalid date format exception.Please insert the date in the format dd.mm.yyyy");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                student2.setInput2(scanner.nextLine());
                getResult2();
            }
        }
        LocalDateTime dateNow = LocalDateTime.now();
        LocalDateTime sum = dateOfStart2.plus(javaDeveloper.getDuration());

        LocalDateTime temporal = LocalDateTime.from(dateOfStart2);
        temporal = temporal.plus(javaDeveloper.getDuration());

        long years = temporal.until(dateNow, ChronoUnit.YEARS);
        temporal = temporal.plusYears( years );

        long months = temporal.until(dateNow, ChronoUnit.MONTHS);
        temporal = temporal.plusMonths( months );

        long days = temporal.until(dateNow, ChronoUnit.DAYS);
        temporal = temporal.plusDays( days );

        long hours = temporal.until(dateNow, ChronoUnit.HOURS);
        temporal = temporal.plusHours( hours );

        long minutes = temporal.until(dateNow, ChronoUnit.MINUTES);
        temporal = temporal.plusMinutes( minutes );

        long seconds = temporal.until(dateNow, ChronoUnit.SECONDS);
        if (temporal.compareTo(sum)<0) {
            System.out.println( student1.toString() + "Обучение не закончено. До окончания обучения осталось " + (-years) + " years " +
                    (- months) + " months " +
                    (-days) + " days " +
                    (-hours) + " hours " +
                    (-minutes) + " minutes " +
                    (-seconds) + " seconds ");
        }
        else {
            System.out.println( student2.toString() + "Обучение закончено  " + years + " years " +
                    months + " months " +
                    days + " days " +
                    hours + " hours " +
                    minutes + " minutes " +
                    seconds + " seconds назад");

        }
    }
}
