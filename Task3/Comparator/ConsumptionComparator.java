package Task3.Comparator;

import Task3.ClassesTree.Car;

import java.util.Comparator;

public class ConsumptionComparator implements Comparator<Car> {

    public int compare (Car c1, Car c2){
        if (c1.getConsumption()==c2.getConsumption()){
            return 0;
        }
        if (c1.getConsumption()> c2.getConsumption()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
