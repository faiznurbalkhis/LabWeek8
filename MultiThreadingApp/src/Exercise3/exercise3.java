package Exercise3;

public class exercise3 {
	
public static void main(String[] args) {
		
		Runnable TextRunnable = new TextRunnable();
		
		Thread w1 = new Thread(TextRunnable);
		w1.setName("Word 1");
		
		Thread w2 = new Thread(TextRunnable);
		w2.setName("Word 2");
		
		Thread w3 = new Thread(TextRunnable);
		w3.setName("Word 3");
		
//		Thread statementThread = new StatementPrinter();
//		statementThread.setName("statementThread");
		
		
		// Execute thread
		w1.start();
		w2.start();
		w3.start();
	}

}
