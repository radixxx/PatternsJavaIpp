package Creational.AbstractFactory;

public class WinOsFactory implements EnterptiseFactoryElements {
    @Override
    public Button createButton() {
        return new WinOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinOsCheckBox();
    }
}
