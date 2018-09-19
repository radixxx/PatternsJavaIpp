package Behavioral.State;

public class PrinterScan implements PrinterState {

	private final Printer printer;
	
	public PrinterScan(Printer printer){
		this.printer = printer;
	}
	 
	@Override
	public void print() {
		System.out.println("Walking...");
		printer.setPrinterState(printer.getPrinterOn());
	}

	@Override
	public void scan() {
		System.out.println("Scaning...");
	}

	@Override
	public void off() {
		System.out.println("Cannot switched off while scaning...");
	}
}
