package Task4.Calculation;

import Task4.Curriculum.J2EEDeveloper;
import Task4.Curriculum.JavaDeveloper;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Calculation {
    J2EEDeveloper j2eeDeveloper = new J2EEDeveloper();
    JavaDeveloper javaDeveloper = new JavaDeveloper();
    Student student1 = new Student("Ivan", "Ivanov", "J2EEDeveloper");
    Student student2 = new Student("Petr","Petrov","Java Developer");

    public void getResult1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime dateOfStart1 = LocalDate.parse(student1.getInput1(), formatter).atTime(11, 20);
        LocalDateTime dateNow = LocalDateTime.now();
        LocalDateTime sum = dateOfStart1.plus(j2eeDeveloper.getDuration());

        LocalDateTime temporal = LocalDateTime.from(dateOfStart1);
        temporal = temporal.plus(j2eeDeveloper.getDuration());

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
        System.out.println(temporal);
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

    public void getResult2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime dateOfStart2 = LocalDate.parse(student2.getInput2(), formatter).atTime(8,56);
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
