package Exercise2;

public class exercise2 {
	
	public static void main(String [] args) {
		
		Runnable text = new TextRunnable();
		Thread w1 = new Thread (text);
		Thread w2 = new Thread (text);
		
		try {
			//execute the thread
			w1.start();
			w2.start();
			
			System.out.println("Program ends");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
