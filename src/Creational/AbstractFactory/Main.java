package Creational.AbstractFactory;

import java.util.Scanner;

public class Main {
    private static AppClient configureApp() {
        AppClient app = null;
        EnterptiseFactoryElements factoryElements;

        Scanner scanner = new Scanner(System.in);
        int osName = scanner.nextInt();

        switch (osName) {

            case 1:
                factoryElements = new MacOsFactory();
                app = new AppClient(factoryElements);
                break;
            case 2:
                factoryElements = new WinOsFactory();
                app = new AppClient(factoryElements);
                break;
            case 3:
                factoryElements = new LinuxOsFactrory();
                app = new AppClient(factoryElements);
                break;

            default:
                System.out.println("Other OS!");

        }
        return app;
    }

    public static void main(String[] args) {
        // Printing name of Operating System
        //System.out.println("os.name: " + System.getProperty("os.name"));
        System.out.println("Enter your OS: " + "\n\t1.MacOS" + "\n\t2.WindowsOS " + "\n\t3.LinuxOS ");

        AppClient app = configureApp();
        app.paint();


    }
}












    /*       String osName = System.getProperty("os.name").toLowerCase();
           if(osName.contains("MacOS")){
               factoryElements = new MacOsFactory();
               app = new AppClient(factoryElements);
           }else{
               factoryElements = new WinOsFactory();
               app = new AppClient(factoryElements);
           }
           return app;
       }
   */

