package SOLID;

public class ISP_01 {

    // Interface for Printer functionality
    public static interface Printable {
        void printDocument();
    }

     // Interface for Scanner functionality
    public static interface Scannable {
        void scanDocument();
    }

     // Interface for Fax Machine functionality
    public static interface Faxable {
        void faxDocument();
    }

    // SimplePrinter only implements Printable
    public static class SimplePrinter implements Printable {
        @Override
        public void printDocument() {
            System.out.println("Sending document to the printer...");
        }
    }

    // MultiFunctionPrinter implements all
    public static class MultiFunctionPrinter implements Printable, Scannable, Faxable {
        @Override
        public void printDocument() {
            System.out.println("Printing document to printer.");
        }

        @Override
        public void scanDocument() {
            System.out.println("Scanning document to scanner.");
        }

        @Override
        public void faxDocument() {
            System.out.println("Faxing document to machine.");
        }
    }

    //Main Method
    public static void main(String[] args) {
        Printable printer = new SimplePrinter();
        printer.printDocument();

        System.out.println("-----------");

        MultiFunctionPrinter multifunctionPrinter = new MultiFunctionPrinter();
        multifunctionPrinter.printDocument();
        multifunctionPrinter.scanDocument();
        multifunctionPrinter.faxDocument();
    }
}
