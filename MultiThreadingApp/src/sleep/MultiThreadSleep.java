package sleep;

public class MultiThreadSleep {
	
public static void main(String[] args) {
		
		// Create objects of thread and give names
		Runnable numberable = new NumberPrinter();
		Thread numberThread = new Thread(numberable);
		numberThread.setName("numberThread");
		
		Thread statementThread = new StatementPrinter();
		statementThread.setName("statementThread");
		
		
		// Execute thread
		statementThread.start();
		numberThread.start();

	}

}
