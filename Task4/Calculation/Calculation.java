package Task4.Calculation;

import Task4.Curriculum.Developer;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Calculation {

    Student student1 = new Student("Ivan", "Ivanov", "J2EEDeveloper","09.10.2019");
    Student student2 = new Student("Petr","Petrov","Java Developer","18.10.2019");

    CalculateDuration duration = new CalculateDuration();

    public void getResult1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime dateOfStart1 = LocalDate.parse(student1.getInput(), formatter).atTime(9, 20);
        LocalDateTime dateNow = LocalDateTime.now();
        LocalDateTime sum = dateOfStart1.plus(duration.getDuration2());

        LocalDateTime temporal = LocalDateTime.from(dateOfStart1);
        temporal = temporal.plus(duration.getDuration2());


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
                    (- days) + " days " +
                    (- hours) + " hours " +
                    (- minutes) + " minutes " +
                    (- seconds) + " seconds ");
        }
        else {
            System.out.println( student1.toString() + "Обучение закончено  " + years + " years " +
                    months + " months " +
                    days + " days " +
                    hours + " hours " +
                    minutes + " minutes " +
                    seconds + " seconds назад");

        }
    }

    public void getResult2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime dateOfStart2 = LocalDate.parse(student2.getInput(), formatter).atTime(8,56);
        LocalDateTime dateNow = LocalDateTime.now();
        LocalDateTime sum = dateOfStart2.plus(duration.getDuration1());

        LocalDateTime temporal = LocalDateTime.from(dateOfStart2);
        temporal = temporal.plus(duration.getDuration1());

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
            System.out.println( student2.toString() + "Обучение не закончено. До окончания обучения осталось " + (-years) + " years " +
                    (- months) + " months " +
                    (- days) + " days " +
                    (- hours) + " hours " +
                    (- minutes) + " minutes " +
                    (- seconds) + " seconds ");
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


