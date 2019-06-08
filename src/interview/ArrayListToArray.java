package interview;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		System.out.println("Initial ArrayList"+al);

		Object[] objects = al.toArray();

		// Printing array of objects
		System.out.println("After Converting to arry");
		for (Object obj : objects)
			System.out.print(obj + " ");
		
		System.out.println();
		al.add(3);
		al.add(4);
		
	System.out.println("added some new values to arrayList and see the effect on the previous array ");
	for (Object obj : objects)
		System.out.print(obj + " ");
	System.out.println("checking the  ");
	
	Object[] objects1 = al.toArray();
	for (Object obj : objects1)
		System.out.print(obj + " ");
	
}}
