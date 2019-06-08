package multithreading;

public class MyThread extends Thread {
	
	public void run(){
		for (int i = 0; i <15 ; i++) {
			System.out.println("I am in Child Thread");
			
		}
		
	}

}