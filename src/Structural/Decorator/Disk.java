package Structural.Decorator;

public class Disk extends CarDecorator {

    private final Car car;

    public Disk(Car car) {
        this.car = car;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", Green Olives (5.47)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+5.47;
    }

}