public class DefaultMethodsTest {

	public static void main(String args[]) {
		Printer printer = new PrinterAndScanner();
		printer.print();
	}
}

interface Printer {
	default void print() {
		System.out.println("I can print!");
	}
}

interface Scanner {
	default void scan() {
		System.out.println("I can scan!");
	}
}

class PrinterAndScanner implements Printer, Scanner {
	public void print() {
		Scanner.super.scan();
		Printer.super.print();
	}
}