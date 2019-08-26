package Task3.ClassesTree;


public class Car {
    private String model;
    private String id;
    private double consumption;
    private double nominalPrice;
    private int year;
    private Type type;

    public Car(String model, String id, double consumption, double nominalPrice, int year, Type type) {
        this.model = model;
        this.id = id;
        this.consumption = consumption;
        this.nominalPrice = nominalPrice;
        this.year = year;
        this.type = type;
    }

    public Car() {
    }

    public Type getType() {
        return type;
    }


    public enum Type {
        ECONOMY,
       COMFORT,
       PREMIUM
   }

    public double getConsumption() {
        return consumption;
    }

    public double getNominalPrice() {
        return nominalPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append(" ").append(model);
        sb.append(" registration plate: '").append(id).append('\'');
        sb.append(" consumption=").append(consumption);
        sb.append('}');
        return sb.toString();
    }

}
