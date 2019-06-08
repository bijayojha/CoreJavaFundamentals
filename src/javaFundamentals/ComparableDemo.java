package javaFundamentals;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Ruby3",32));
        list.add(new Employee("Ruby2",32));
        list.add(new Employee("Ruby2",31));
		
        Collections.sort(list);
        
        System.out.println(list);
	}

}