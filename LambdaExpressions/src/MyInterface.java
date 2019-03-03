/*
 * Implement SAM with anonymous classes in java
 * */
public class MyInterface {

	
	public static void main(String args[]) {
		
		new Thread(new Runnable() {
			
			
			public void run() {
				System.out.println("My Thread");
			}
			
		}).start();
		
	}
}
