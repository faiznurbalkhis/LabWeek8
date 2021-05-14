package imrun;

import java.util.Arrays;

public class NumberPrinter implements Runnable {
	
	
	public static void main (String[] args) {
		
		String[] text = {"It", "is", "recommended", "to", "use", "calendar", "class"};
		

		
	}

	@Override
	public void run() {
		
		// Execute task
		for (int counter = 0; counter < 5; counter++) {
			System.out.println(counter);
		}
		
	}

}
