package collection;

import java.util.HashSet;

class Employee{
	int empId;
	@Override
	public int hashCode() {
		
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	String name;
	int sal;
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public Employee(int empId,String name, int sal) {
		this.empId=empId;
		this.name = name;
		this.sal = sal;
	}
	 @Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
	}
	 
 }



public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Employee> hs=new HashSet<>();
		Employee e1=new Employee(1,"Bijay", 100);
		Employee e2=new Employee(2,"Bijay", 100);
		Employee e3=new Employee(3,"Bijay", 100);
		Employee e4=new Employee(4,"Ajay", 100);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
	
		System.out.println(hs);
		System.out.println(hs.size());
		removeDuplicate(hs);
	}

	private static void removeDuplicate(HashSet<Employee> hs) {
		
//	   for(Employee emp: hs){
//		   String tempEmpName=emp.getName();
//		   System.out.println(tempEmpName);
//	   }
		
			
		}
		
	}


