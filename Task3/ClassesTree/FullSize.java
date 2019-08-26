package Task3.ClassesTree;

public class FullSize extends Car implements ChildSafetySeat {
    private int seats;

    public FullSize(String model, String id, double consumption, double nominalPrice, int year, Type type, int seats) {
        super(model, id, consumption, nominalPrice, year, type);
        this.seats = seats;
    }

    public FullSize() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void getSafetySeat() {
        System.out.println("There is a child safety seat in your car. Please, coonect your driver if you need an extra seat");
    }

}
