package Structural.Decorator;

public class CorpusBody extends CarDecorator {

    private final Car car;

    public CorpusBody(Car car) {
        this.car = car;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+", CorpusBody (25.88)";
    }


    @Override
    public double getPrice() {
        return car.getPrice()+25.88;
    }

}