package interview;

import java.util.HashSet;

class Employee{
	
	String name;
	 int sal;
	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	 @Override
		public String toString() {
			return "Employee [name=" + name + ", sal=" + sal + "]";
		}
	 
 }



public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Employee> hs=new HashSet<>();
		Employee e1=new Employee("Bijay", 100);
		Employee e2=new Employee("Bijay", 100);
		Employee e3=new Employee("Bijay", 100);
		Employee e4=new Employee("Bijay", 100);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		System.out.println(hs);
		System.out.println(hs.size());
	}

}
