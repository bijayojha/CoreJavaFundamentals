package arrayDemo;

public class Parent {
	
	int abc;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + abc;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (abc != other.abc)
			return false;
		return true;
	}
	Parent display(int i){
		System.out.println("Parent");
		return null;
	}

}
class Child extends Parent{
	
	Child display(int i){
		System.out.println("Child");
		return null;
	}
	public static void main(String[] args) {
		Parent p=new Child();
		p.display(5);
		
		
	}
	
	
}
