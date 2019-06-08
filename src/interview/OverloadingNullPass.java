package interview;

public class OverloadingNullPass {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent pp = new Child();

		System.out.println(p.test());
		System.out.println(c.test());
		System.out.println(pp.test());

	}

}

class Parent {
	Integer test() {
		return 10;
	}
}

class Child extends Parent {
	Integer test() {
		return 20;
	}

}
