package extendthread;

public class MultiPrinter {
	
public static void main(String[] args) {
		
		// Create objects of thread
		Thread printerThread1 = new StatementPrinter();
		Thread printerThread2 = new StatementPrinter();

		// Execute threads
		printerThread2.start();
		printerThread1.start();

	}

}
