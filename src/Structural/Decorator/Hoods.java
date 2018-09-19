package Structural.Decorator;

public class Hoods extends CarDecorator {

    private final Car car;

    public Hoods(Car car) {
        this.car = car;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", Hoods (12.75)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+12.75;
    }

}