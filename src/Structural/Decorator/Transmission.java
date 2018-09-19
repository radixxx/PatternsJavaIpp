package Structural.Decorator;

public class Transmission extends CarDecorator {

    private final Car car;

    public Transmission(Car car) {
        this.car = car;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", Transmission (9.25)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+9.25;
    }

}