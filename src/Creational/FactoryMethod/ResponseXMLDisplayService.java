package Creational.FactoryMethod;

public class ResponseXMLDisplayService extends DisplayService{

    @Override
    public XMLParser getParser() {
        return new ResponseXMLParser();
    }

}
