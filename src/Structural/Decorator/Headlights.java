package Structural.Decorator;

public class Headlights extends CarDecorator {

    private final Car car;

    public Headlights(Car car) {
        this.car = car;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", Headlights (7.92)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+7.92;
    }

}
