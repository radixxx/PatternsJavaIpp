package Creational.FactoryMethod;

public class MainFactoryMethodPattern {

    public static void main(String[] args) {
        DisplayService service = new FeedbackXMLDisplayService();
        service.display();

        service = new ErrorXMLDisplayService();
        service.display();

        service = new OrderXMLDisplayService();
        service.display();

        service = new ResponseXMLDisplayService();
        service.display();

        service = new FeedbackXMLDisplayService();
        service.display();

    }

}
