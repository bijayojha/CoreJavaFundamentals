package designpatterns.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingletonDesignPatternDemo1 {

	private static SingletonDesignPatternDemo1 soleInstance = null;

	private SingletonDesignPatternDemo1() {
		System.out.println("I am creating...");
	}

	public static SingletonDesignPatternDemo1 getInstance() {

		if (soleInstance == null) {
			soleInstance = new SingletonDesignPatternDemo1();
		}
		return soleInstance;
	}

}

class STDPViolationByMultiThread {
	public static void main(String[] args) throws Exception {
		SingletonDesignPatternDemo1 s1 = SingletonDesignPatternDemo1.getInstance();
		SingletonDesignPatternDemo1 s2 = SingletonDesignPatternDemo1.getInstance();
		System.out.println("s1  " + s1.hashCode());
		System.out.println("s2  " + s2.hashCode());

		// creating thread by java 8 and lambda expressions

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(STDPViolationByMultiThread::useSingletonObject);
		service.submit(STDPViolationByMultiThread::useSingletonObject);

		service.shutdown();

	}

	// Lets have a method to use the object of singleton class.
	static void useSingletonObject() {
		SingletonDesignPatternDemo1 s3 = SingletonDesignPatternDemo1.getInstance();
		System.out.println(" I am checking singleton violation by multiple thread" + "s3  " + s3.hashCode());
	}
}