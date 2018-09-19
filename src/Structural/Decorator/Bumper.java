package Structural.Decorator;

public class Bumper extends CarDecorator {

    private final Car car;

    public Bumper(Car car) {
        this.car = car;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", Red Bumper (3.75)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+3.75;
    }

}
