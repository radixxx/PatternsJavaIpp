package Structural.Decorator;

public abstract class CarDecorator implements Car {

    @Override
    public String getDesc() {
        return "add component";
    }

}
