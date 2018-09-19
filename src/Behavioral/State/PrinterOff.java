package Behavioral.State;

public class PrinterOff implements PrinterState {

	private final Printer printer;
	
	public PrinterOff(Printer printer){
		this.printer = printer;
	}
	 
	@Override
	public void print() {
		System.out.println("Print...");
		printer.setPrinterState(printer.getPrinterOn());
	}

	@Override
	public void scan() {
		System.out.println("Cannot scan at Off state.");
	}

	@Override
	public void off() {
		System.out.println("Already switched off...");
	}
}
