package Behavioral.State;

public class MainStatePattern {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print();
		printer.scan();
		printer.print();
		printer.off();
		
		printer.print();
		printer.off();
		printer.scan();

	}

}
