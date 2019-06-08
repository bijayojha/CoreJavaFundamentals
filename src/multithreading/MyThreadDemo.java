package multithreading;

public class MyThreadDemo {

	public static void main(String[] args) {

		MyThread t = new MyThread();

		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

		for (int j = 0; j < 50; j++) {
			System.out.println("I am in main thread");
		}
	}

}
