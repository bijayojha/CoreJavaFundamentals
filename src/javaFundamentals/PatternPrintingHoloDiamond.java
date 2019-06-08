package javaFundamentals;

import java.util.Scanner;

/* program to pring a pattern like tringle */


public class PatternPrintingHoloDiamond {
	public static void main(String[] args) {
	System.out.println("Enter the Number of row");
	Scanner sc= new Scanner(System.in);
	
	int row= sc.nextInt();
	// print the uppertringle first
	for(int i=0;i<=row;i++){
		
		printSpace(row-i);
		printStar(i);
		
		
		System.out.println(); 
	}
	
	// printing the lowertringle 
	
	for(int i=row;i>=0;i--){
		
		printSpace(row-i);
		printStar(i);
		
		
		System.out.println();
	}
	
	
	}
	
	static void   printSpace(int spaceRange){
		for(int j=0;j<=spaceRange;j++)
		System.out.print(" ");
	
	}
	
	static void   printStar(int starRange){
		for(int i=0;i<((2*starRange)+1);i++)
		
		if(i==0|i==((2*starRange)))
			System.out.print("*");
		else
			System.out.print(" ");
	}
	
	

}