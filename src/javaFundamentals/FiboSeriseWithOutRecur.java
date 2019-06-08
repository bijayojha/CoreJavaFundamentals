package javaFundamentals;



import java.util.Scanner;


public class FiboSeriseWithOutRecur {

	public static void main(String[] args) {
		
		System.out.println("Please enter the range up to what you want to print the fibonic serise");
		Scanner sc= new Scanner(System.in);
		int range= sc.nextInt();
		
		int firstFibNum=0;
		int secondFibNum=1;
		
		int nextFibNum=0;
		
		System.out.println("Please find the below fibonic Serise in the range "+range);
		System.out.print("0"+"	");
		System.out.print("1"+"	");
		
		while(range>nextFibNum){
			
			nextFibNum=firstFibNum+secondFibNum;
			System.out.print(nextFibNum+"	");
			firstFibNum=secondFibNum;
			secondFibNum=nextFibNum;
			
			
		}
		
	
		
		
	}
	
	
}