package Creational.AbstractFactory;

public class MacOsFactory implements EnterptiseFactoryElements {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOsCheckBox();
    }
}
