package Structural.Decorator;

import java.text.DecimalFormat;

public class MainDecoratorPattern {

    public static void main(String[] args) {

        DecimalFormat dformat = new DecimalFormat("#.##");
        Car car = new SimplyBaseCar();

        car = new CorpusBody(car);
        car = new Transmission(car);
        car = new Radiator(car);

        System.out.println("Desc: "+car.getDesc());
        System.out.println("Price: "+dformat.format(car.getPrice()));

        System.out.println("========================================================================================");

        car = new StandartCar();

        car = new CorpusBody(car);
        car = new Headlights(car);
        car = new Mirors(car);
        car = new Transmission(car);
        car = new Bumper(car);


        System.out.println("Desc: "+car.getDesc());
        System.out.println("Price: "+dformat.format(car.getPrice()));
    }

}
