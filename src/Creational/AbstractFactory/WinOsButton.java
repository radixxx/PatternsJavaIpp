package Creational.AbstractFactory;

public class WinOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton!");
    }
}
