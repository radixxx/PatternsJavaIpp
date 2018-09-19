package Creational.FactoryMethod;

public class FeedbackXMLDisplayService extends DisplayService{

    @Override
    public XMLParser getParser() {
        return new FeedbackXMLParser();
    }

}