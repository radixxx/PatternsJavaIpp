package Behavioral.State;

public class Printer implements PrinterState {

	private PrinterState printerOn;
	private PrinterState printerScan;
	private PrinterState printerOff;
	private PrinterState printerStandby;
	
	private PrinterState state;
	
	public Printer(){
		this.printerOn = new PrinterOn(this);
		this.printerScan = new PrinterScan(this);
		this.printerOff = new PrinterOff(this);
		this.printerStandby = new PrinterStandby(this);
		
		this.state = printerOn;
	}
	
	public void setPrinterState(PrinterState state){
		this.state = state;
	}
	
	@Override
	public void print() {
		state.print();
		setState(getPrinterStandby());
	}

	@Override
	public void scan() {
		state.scan();
		setState(getPrinterStandby());
	}

	@Override
	public void off() {
		state.off();
	}

	public PrinterState getPrinterOn() {
		return printerOn;
	}

	public void setPrinterOn(PrinterState printerOn) {
		this.printerOn = printerOn;
	}

	public PrinterState getPrinterScan() {
		return printerScan;
	}

	public void setPrinterScan(PrinterState printerScan) {
		this.printerScan = printerScan;
	}

	public PrinterState getPrinterOff() {
		return printerOff;
	}

	public void setPrinterOff(PrinterState printerOff) {
		this.printerOff = printerOff;
	}

	public PrinterState getState() {
		return state;
	}

	public void setState(PrinterState state) {
		this.state = state;
	}

	public PrinterState getPrinterStandby() {
		return printerStandby;
	}

	public void setPrinterStandby(PrinterState printerStandby) {
		this.printerStandby = printerStandby;
	}
	
}
