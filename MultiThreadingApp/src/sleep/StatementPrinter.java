package sleep;

public class StatementPrinter extends Thread {
	
	public void printStatement() {

		try {
			for (int counter = 0; counter < 5; counter++) {
	
				System.out.println("Selamat Hari Raya");
				
				// Suspend the current thread for 1000 milliseconnds
				Thread.sleep(1000);
			}
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		// Execute task
		printStatement();

	}


}
