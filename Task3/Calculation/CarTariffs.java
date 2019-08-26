package Task3.Calculation;

import Task3.Calculation.CabGarage;
import Task3.ClassesTree.Car;
import Task3.ClassesTree.FullSize;

import static Task3.ClassesTree.Car.Type.*;
import static Task3.ClassesTree.Car.Type.PREMIUM;

public class CarTariffs {
    private Car[] economyCars;
    private Car[] economyFullSizeCars;
    private Car[] comfortCars;
    private Car[] premiumCars;

    public Car[] getEconomyCars() {
        return economyCars;
    }

    public void setEconomyCars(Car[] economyCars) {
        this.economyCars = economyCars;
    }

    public Car[] getEconomyFullSizeCars() {
        return economyFullSizeCars;
    }

    public void setEconomyFullSizeCars(Car[] economyFullSizeCars) {
        this.economyFullSizeCars = economyFullSizeCars;
    }

    public Car[] getComfortCars() {
        return comfortCars;
    }

    public void setComfortCars(Car[] comfortCars) {
        this.comfortCars = comfortCars;
    }

    public Car[] getPremiumCars() {
        return premiumCars;
    }

    public void setPremiumCars(Car[] premiumCars) {
        this.premiumCars = premiumCars;
    }

    public Car[] getArrayCabEconomy() { // gets an array of Economy tariff cars
        CabGarage garage = new CabGarage();
        int count = 0;
        for (int i = 0; i < garage.cars.length; i++) {
            if (garage.cars[i].getType() == ECONOMY) {
                count++;
            }
        }
        economyCars = new Car[count];
        int index = 0;
        for (int i = 0; i < garage.cars.length; i++) {
            if (garage.cars[i].getType() == ECONOMY) {
                economyCars[index++] = garage.cars[i];
            }
        }
        return economyCars;
    }


    public Car[] getArrayCabComfort() { // gets an array of Comfort tariff cars
        CabGarage garage = new CabGarage();
        int count = 0;
        for (int i = 0; i < garage.cars.length; i++) {
            if (garage.cars[i].getType() == COMFORT) {
                count++;
            }
        }
        comfortCars = new Car[count];
        int index = 0;
        for (int i = 0; i < garage.cars.length; i++) {
            if (garage.cars[i].getType() == COMFORT) {
                comfortCars[index++] = garage.cars[i];
            }
        }
        return comfortCars;
    }

    public Car[] getArrayCabPremium() { // gets an array of Premium tariff cars
        CabGarage garage = new CabGarage();
        int count = 0;
        for (int i = 0; i < garage.cars.length; i++) {
            if (garage.cars[i].getType() == PREMIUM) {
                count++;
            }
        }
        premiumCars = new Car[count];
        int index = 0;
        for (int i = 0; i < garage.cars.length; i++) {
            if (garage.cars[i].getType() == PREMIUM) {
                premiumCars[index++] = garage.cars[i];
            }
        }
        return premiumCars;
    }

    public Car[] getArrayCabFullSizeEconomy() { //gets an array of Economy tariff full-size cars
        CabGarage garage = new CabGarage();
        int count = 0;
        for (int i = 0; i < economyCars.length; i++) {
            if (economyCars[i] instanceof FullSize) {
                count++;
            }
        }
        economyFullSizeCars = new Car[count];
        int index = 0;
        for (int i = 0; i < economyCars.length; i++) {
            if (economyCars[i] instanceof FullSize) {
                economyFullSizeCars[index++] = economyCars[i];
            }
        }
        return economyFullSizeCars;
    }
}
