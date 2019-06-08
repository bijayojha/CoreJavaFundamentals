package javaFundamentals;

import java.util.Scanner;

/* program to pring a pattern like tringle */


public class PatternPrintUpperHoloTringle {
	public static void main(String[] args) {
	System.out.println("Enter the Number of row");
	Scanner sc= new Scanner(System.in);
	
	int row= sc.nextInt();
	 int tmpCheck=row;
	
	
	
	for(int i=row;i>=0;i--){
		printSpace(row);
		printStar(i,tmpCheck);
			
		System.out.println();
		row= row+1;
	}
	 
		
	
	}
	
	static void   printSpace(int spaceRange){
		for(int j=0;j<=spaceRange;j++)
		System.out.print(" ");
	
	}
	
	static void   printStar(int starRange,int tmpCheck1){
		if(starRange==tmpCheck1|starRange==0){
			for(int i=0;i<((2*starRange)+1);i++)
					System.out.print("*");
			
		}
		
		else{
			for(int i=0;i<((2*starRange)+1);i++){
				if(i==0|i==((2*starRange))){
					System.out.print("*");
				}else
					System.out.print(" ");
				
			}
				
		}
	}
		
}
		
	
	
	