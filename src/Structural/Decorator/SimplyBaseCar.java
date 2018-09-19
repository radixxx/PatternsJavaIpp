package Structural.Decorator;

public class SimplyBaseCar implements Car {

    @Override
    public String getDesc() {
        return "SimplyBaseCar (230)";
    }

    @Override
    public double getPrice() {
        return 230;
    }


}
