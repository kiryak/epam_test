package Task3.Main;

import Task3.Calculation.CarTariffs;
import Task3.ClassesTree.FullSize;
import Task3.Calculation.SortCars;
import Task3.Calculation.TotalCost;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        SortCars sorting = new SortCars();
        TotalCost cost = new TotalCost();
        application.inputAndOutput(); //chooses the type of car according to the passenger's order
        cost.getCost(); //counts the total cost of all cars in the garage
        sorting.sort(); //sorts cars according to their fuel consumption level
    }

    //chooses the type of car according to the passenger's order
    public void inputAndOutput() {
        FullSize car = new FullSize();
        CarTariffs tariffs = new CarTariffs();
        Scanner scanner = new Scanner(System.in);
        tariffs.getArrayCabEconomy();
        tariffs.getArrayCabFullSizeEconomy();
        tariffs.getArrayCabComfort();
        tariffs.getArrayCabPremium();
        System.out.println("Please, choose tariff of your trip");
        System.out.println("For economy trip - press 1, for comfort trip - press 2, for premium trip - press 3");
        int number = scanner.nextInt();
        switch (number) {
            case 1: {
                System.out.println("If number of passengers exceeds 3 or if you want a child safety seat, please press 1. If not - press 2");
                Scanner scanner1 = new Scanner(System.in);
                int number1 = scanner1.nextInt();
                int random = (int) Math.random() * tariffs.getEconomyFullSizeCars().length + 1;
                if (number1 == 1) {
                    System.out.println("Your taxi: " + tariffs.getEconomyFullSizeCars()[random]);
                    car.getSafetySeat();
                } else {
                    System.out.println("Your taxi: " + tariffs.getEconomyCars()[random]);
                }
                break;
            }
            case 2: {
                int random = (int) Math.random() * tariffs.getComfortCars().length + 1;
                System.out.println("Your taxi " + tariffs.getComfortCars()[random]);
                car.getSafetySeat();
            }
            break;

            case 3: {
                int random = (int) Math.random() * tariffs.getPremiumCars().length + 1;
                System.out.println("Your taxi: " + tariffs.getPremiumCars()[random]);
                car.getSafetySeat();
            }
            break;
            default:
                System.out.println("Wrong input.");
                inputAndOutput();
        }
    }
}


