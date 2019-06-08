package javaFundamentals;

import java.util.Scanner;

public class FactorialDemoForRangeRecur {
	
	public static void main(String[] args) {
		FactorialDemoForRangeRecur ob=new FactorialDemoForRangeRecur();
		System.out.println("Please enter the range with in which you want to print the factorial of each number");
		Scanner sc= new Scanner(System.in);
		long range=sc.nextLong();
		
		for(long i=0;i<=range;i++){
			long orgNum= i;
			
			long result= ob.factorialOf(orgNum);
			System.out.println("The Factorial of "+orgNum+"  i.e "+orgNum+"! 	 = "+result);
		}
		
	}
	
	long factorialOf(long num){
		
		if(num==0)	
			return 1;
		else 
			return num*factorialOf(num-1);
			
			
		}
		
	}
	
