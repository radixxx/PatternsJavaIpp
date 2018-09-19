package Structural.Decorator;

public class Radiator extends CarDecorator {

    private final Car car;

    public Radiator(Car car) {
        this.car = car;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", Radiator (18.12)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+18.12;
    }

}