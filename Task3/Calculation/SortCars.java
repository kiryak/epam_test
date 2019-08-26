package Task3.Calculation;

import Task3.ClassesTree.Car;
import Task3.Comparator.ConsumptionComparator;

import java.util.Arrays;

public class SortCars {  //sorts cars according to their fuel consumption level
    public void sort() {
        CabGarage garage = new CabGarage();
        ConsumptionComparator consumptionComparator = new ConsumptionComparator();
        Arrays.sort(garage.cars, consumptionComparator);
        System.out.println("Sorted: ");
        for (Car c : garage.cars) {
            System.out.println(c.toString());
        }
    }
}
