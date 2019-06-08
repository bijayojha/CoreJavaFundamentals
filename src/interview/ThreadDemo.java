package interview;

public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		BijayThread bjObj=new BijayThread();
		Thread bjThread1=new Thread(bjObj);
		Thread bjThread2=new Thread(bjObj);
		bjThread1.setName("bjFirstThread");
		bjThread2.setName("bjSecondThread");
		
		bjThread1.start();
		//bjThread2.start();
		bjThread1.join();
//		bjThread2.join();
		for(int i=0;i<10;i++)
			System.out.println("Bijay");
		

	}
}

class BijayThread extends Thread{
	@Override
	public void run(){
		synchronized (this) {
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()+"  "+i);
			}
		}
		
	}
}
