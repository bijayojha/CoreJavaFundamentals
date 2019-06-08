package interview;

class Employee1 {
	public static void show() {
		System.out.println("HELLO WORLD");
	}
}

public class StaticMethCallWithNullRef {
	public static void main(String arg[]) {
		Employee1 ref = null;
		ref.show(); // Absolutely perfect to called to fun()
	}
}