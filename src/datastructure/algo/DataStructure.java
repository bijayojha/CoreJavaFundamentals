package datastructure.algo;

import java.util.Scanner;

public class DataStructure {

	static int dataStructure[];
	Scanner sc = new Scanner(System.in);

	public void storeValuesToDataStructure() {
		
		System.out.println("How many elements you want to put into the DataStructure ?");
		int totalNumToStore=sc.nextInt();
		dataStructure = new int[totalNumToStore];
		
		System.out.println("Enter "+totalNumToStore+ "  Elements to the DataStructure");
		for (int i = 0; i < dataStructure.length; i++) {
			dataStructure[i] = sc.nextInt();
		}
		System.out.println("All the below elements stored successfully");
		
		//just showing the inputed values
		for(int i=0;i<dataStructure.length;i++)
			System.out.print(dataStructure[i]+ "  ");
		System.out.println();
	}

}