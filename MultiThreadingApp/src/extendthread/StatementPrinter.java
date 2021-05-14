package extendthread;

import java.time.LocalTime;

public class StatementPrinter extends Thread {
	
	public void printStatement() {

		for (int counter = 0; counter < 5; counter++) {

			System.out.println("Selamat Hari Raya");
			System.out.println(java.time.LocalTime.now()); 
		}
	}

	@Override
	public void run() {

		// Execute task to print statements
		printStatement();

	}

}
