package designpatterns.singleton;

public class SingletonDemoFinal {

	private static volatile SingletonDemoFinal soleInstance = null;

	private SingletonDemoFinal() {
		if (soleInstance != null) {
			System.out.println("this method is not supported please use getInstance method");
		}
		System.out.println("creating...");
	}

	public static SingletonDemoFinal getInstance() {

		if (soleInstance == null) {
			synchronized (SingletonDemoFinal.class) {
				if (soleInstance == null) {
					soleInstance = new SingletonDemoFinal();
				}
			}
		}
		return soleInstance;
	}

	protected Object clone() {
		return soleInstance;
	}

	private Object readResolve() {
		return soleInstance;

	}
}