package Creational.FactoryMethod;

public class FeedbackXMLParser implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";
    }

}

