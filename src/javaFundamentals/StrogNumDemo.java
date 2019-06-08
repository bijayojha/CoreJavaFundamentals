package javaFundamentals;

import java.util.Scanner;

/*Strong numbers are the numbers whose sum of factorial of digits is equal to the original number. Example: 145 is a strong number*/

public class StrogNumDemo {
	
	public static void main(String[] args) {
		StrogNumDemo ob=new StrogNumDemo();
		System.out.println("Please enter the range with in which you want to print the strong number");
		Scanner sc= new Scanner(System.in);
		long range=sc.nextLong();
		
		for(long i=1;i<=range;i++){
			long orgNum= i;
			long sum=0;
			long tempCheck=orgNum;
			while(orgNum>0){
				long digit=orgNum%10;
				sum=sum+ob.factorialOf(digit);
				orgNum=orgNum/10;
			}
			
			if(sum==tempCheck)
			System.out.println("The sum of Factorial of each digit of the number "+tempCheck+"  i.e "+tempCheck+" 	 = "+sum+"	(So Strong number)");
		}
		
	}
	
	long factorialOf(long num){
		
		if(num==0)	
			return 1;
		else 
			return num*factorialOf(num-1);
			
			
		}
		
	}