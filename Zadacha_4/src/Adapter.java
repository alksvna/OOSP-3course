public class Adapter implements Equipment {

    private Printer printer;
    private Scanner scanner;
    public Adapter(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void connectToDevice() {
        this.printer.connectionPrinter();
        this.printer.printingPrinter();
        this.scanner.connectionScanner();
        this.scanner.printingScanner();
    }
}
