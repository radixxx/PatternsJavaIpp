package Creational.AbstractFactory;

public class WinOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WinOSCheckBox.");
    }
}
