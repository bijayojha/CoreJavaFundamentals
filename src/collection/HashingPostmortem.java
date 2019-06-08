package collection;

import java.util.HashMap;

public class HashingPostmortem {
	public static void main(String[] args) {
		HashMap<Employee12, Integer> hashMap=new HashMap<>();
		Employee12 emp1=new Employee12(100, "Bijay");
		Employee12 emp2=new Employee12(100, "Bijay");
		Employee12 emp3=new Employee12(100, "Bijay");
		Employee12 emp4=new Employee12(101, "Bijay");
		Employee12 emp5=new Employee12(100, "Bijay");
		
		hashMap.put(emp1, 1);
		hashMap.put(emp2, 2);
		hashMap.put(emp3, 3);
		hashMap.put(emp4, 4);
		hashMap.put(emp5, 5);
		
		
		
		System.out.println(hashMap.size());
		System.out.println(hashMap);
		System.out.println(hashMap.get(emp1));
		System.out.println(hashMap.get(emp2));
		System.out.println(hashMap.get(emp3));
		System.out.println(hashMap.get(emp4));
		System.out.println(hashMap.get(emp5));
	}

}

class Employee12 {
	int id;
	String name;

	@Override
	public String toString() {
		return "Employee12 [id=" + id + ", name=" + name + "]";
	}

	public Employee12(int id, String name) {
		this.id = id;
		this.name = name;
	}

	

}
