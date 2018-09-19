package Creational.AbstractFactory;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created LinuxOSButton!");
    }
}
