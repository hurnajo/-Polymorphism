package main;

//initialize the parent class PrintingMachine
class PrintingMachine {
    public void printing() {
        System.out.println("Printing...\n");
    }
}

//initialize ColoredPrinter with Printer as its parent class
class ColoredPrinter extends PrintingMachine {
    @Override
    public void printing() {//Overriden Method
        System.out.println("Detecting Colored Text...\nPrinting...\n");
    }
}

//initialize BlackAndWhitePrinter with Printer as its parent class
class BlackAndWhitePrinter extends PrintingMachine {
    @Override
    public void printing() {//Overriden Method
        System.out.println("Can only Print Black Text...\nPrinting Black...");
    }
}

public class Printer {
    public static void main(String[] args) {

        //initialize printingMachine as a original PrintingMachine
        PrintingMachine printingMachine = new PrintingMachine();
        printingMachine.printing();

        //initialize coloredPrinter as a ColoredPrinter
        PrintingMachine coloredPrinter = new ColoredPrinter();
        coloredPrinter.printing();

        //initialize blackAndWhitePrinter as a BlackAndWhitePrinter
        PrintingMachine blackAndWhitePrinter = new BlackAndWhitePrinter();
        blackAndWhitePrinter.printing();
    }
}