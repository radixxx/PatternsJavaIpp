package Structural.Decorator;

public class Grilles extends CarDecorator {

    private final Car car;

    public Grilles(Car car) {
        this.car = car;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", Grilles (20.72)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+20.72;
    }

}