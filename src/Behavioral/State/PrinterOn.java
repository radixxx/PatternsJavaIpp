package Behavioral.State;

public class PrinterOn implements PrinterState {

	private final Printer printer;
	
	public PrinterOn(Printer printer){
		this.printer = printer;
	}
	 
	@Override
	public void print() {
		System.out.println("Print...");
	}

	@Override
	public void scan() {
		System.out.println("Scaning...");
		printer.setPrinterState(printer.getPrinterScan());
	}

	@Override
	public void off() {
		printer.setState(printer.getPrinterOff());
		System.out.println("Printer is switched off");
		
	}

}
