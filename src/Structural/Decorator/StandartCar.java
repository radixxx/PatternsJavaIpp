package Structural.Decorator;

public class StandartCar implements Car {

    @Override
    public String getDesc() {
        return "StandartCar (350)";
    }

    @Override
    public double getPrice() {
        return 350;
    }

}
