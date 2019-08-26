package Task3.Calculation;

public class TotalCost {    //counts the total cost of all cars in the garage
    public void getCost() {
        CabGarage garage = new CabGarage();
        long totalCost = 0;
        for (int i = 0; i < garage.cars.length; i++) {
            totalCost += garage.cars[i].getNominalPrice();
        }
        totalCost = Double.valueOf(totalCost).longValue();
        System.out.println("The total cost of all cars are " + totalCost + " rubles");
    }
}
