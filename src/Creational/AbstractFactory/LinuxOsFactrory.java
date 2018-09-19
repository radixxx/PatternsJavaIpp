package Creational.AbstractFactory;

public class LinuxOsFactrory implements EnterptiseFactoryElements {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new LinuxCheckBox();
    }
}
