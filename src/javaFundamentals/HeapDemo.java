package javaFundamentals;

import java.util.Scanner;

public class HeapDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many objects you want to create");
		long  numOfObject= sc.nextLong();
		
		for(long i=0;i<numOfObject;i++){
			
			HeapDemo ob=new HeapDemo();
		}
		System.out.println("All the objects has been created");
	}

}