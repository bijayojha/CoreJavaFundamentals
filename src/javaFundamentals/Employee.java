package javaFundamentals;

class Employee implements Comparable<Employee>{
	private int age;
	private String name;
	
	public Employee(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(this.name.equals(emp.getName())){
			return this.age-emp.getAge();
		}else{
			return this.name.compareTo(emp.getName());
		}
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	
}