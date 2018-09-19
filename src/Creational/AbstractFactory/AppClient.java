package Creational.AbstractFactory;

//Client code
public class AppClient {
    private Button button;
    private CheckBox checkBox;

    public AppClient(EnterptiseFactoryElements factoryElements){
        button = factoryElements.createButton();
        checkBox = factoryElements.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }

}
