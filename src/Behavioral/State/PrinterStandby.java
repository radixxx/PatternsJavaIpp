package Behavioral.State;

public class PrinterStandby implements PrinterState {

private final Printer printer;
	
	public PrinterStandby(Printer printer){
		this.printer = printer;
	}
	 
	@Override
	public void print() {
		System.out.println("In standby state...");
		printer.setState(printer.getPrinterOn());
		System.out.println("Print...");
	}

	@Override
	public void scan() {
		System.out.println("In standby state...");
		printer.setPrinterState(printer.getPrinterScan());
		System.out.println("Scaning...");
	}

	@Override
	public void off() {
		System.out.println("In standby state...");
		printer.setState(printer.getPrinterOff());
		System.out.println("Printer is switched off");
		
	}

}
