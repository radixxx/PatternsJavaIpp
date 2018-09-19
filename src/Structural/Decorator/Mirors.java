package Structural.Decorator;

public class Mirors extends CarDecorator {

    private final Car car;

    public Mirors(Car pizza){
        this.car = pizza;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", Mirors (14.25)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+14.25;
    }

}