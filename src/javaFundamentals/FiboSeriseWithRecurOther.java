package javaFundamentals;

import java.util.Scanner;



public class FiboSeriseWithRecurOther {
	static	int firstFibNum=0;
	static 	int secondFibNum=1;
	
	static	int nextFibNum=0;
	static int rangeToVerify=0;


	public static void main(String[] args) {
		
		System.out.println("Please enter the range up to what you want to print the fibonic serise");
		Scanner sc= new Scanner(System.in);
		int range= sc.nextInt();
		rangeToVerify=range;
		
		
		
		System.out.println("Please find the below fibonic Serise in the range "+range);
		System.out.print("0"+"	");
		System.out.print("1"+"	");
		
		printRecurSerise(firstFibNum,secondFibNum);
		
		
		
	}
	
	//recursive method to print Fibo serise
	
	static void printRecurSerise(int firstFibNum1,int secondFibNum1){
		
		if(secondFibNum1<rangeToVerify) 
		{
		nextFibNum=firstFibNum1+secondFibNum1;
		System.out.print(nextFibNum+"	");
		firstFibNum=secondFibNum;
		secondFibNum=nextFibNum;
		printRecurSerise(firstFibNum,secondFibNum);
	}
	}
	
	
}