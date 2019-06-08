package designpatterns.singleton;

import java.io.ObjectStreamException;

public class Singleton {

	private static volatile Singleton soleInstance = null;

	private Singleton() {

		// restricting the reflection API to create the object
		if (soleInstance != null) {
			throw new RuntimeException("Can not create instance by this method, please use getInstance() method");
		}
		// proceed with creation
		System.out.println("Creating...");
	}

	public static Singleton getInstance() {
		// Double checked locking , But sometime that will also fail because
		// Java Compiler specification allows the runtime to publish HALF
		// initialized variables that can be used by other thread, so what will
		// happen if the 2nd thread get a reference of half initialized object.
		// the
		// behaviour might be unexcepted. So, to address this we need to use the
		// keyword "volatile" because it says the change to a volatile
		// variable is only published when its fully initiallized.

		
		if (soleInstance == null) { // Check 1
			synchronized (Singleton.class) {
				if (soleInstance == null) { // check 2
					soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;
	}

	// preventing the serialization to create object

	private Object readResolve() throws ObjectStreamException {
		System.out.println(".. Read Resolve..");
		return soleInstance;
	}

	// Preventing cloning to create object
	protected Object clone() {
		return soleInstance;
	}

}