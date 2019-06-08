package javaFundamentals;

import java.util.Scanner;

public class FactorialDemoByIteration {
	
	public static void main(String[] args) {
		FactorialDemoByIteration ob=new FactorialDemoByIteration();
		System.out.println("Please enter the number to find out the Factorial");
		Scanner sc= new Scanner(System.in);
		long orgNum= sc.nextInt();
		long tmpNum= orgNum;
		
		long result= ob.factorialOf(orgNum);
		System.out.println("The Factorial of "+orgNum+"  i.e "+orgNum+"! = "+result);
	}
	
	long factorialOf(long num){
		long sum=1;
		
		for(long i=1;i<=num;i++){
			
			sum=sum*i;
			
		}
		return sum;
	}
	

}