package javaFundamentals;

import java.util.Scanner;

public class OctalToDeciConversion {
	
	
	int powerOf10Method(int pwr){
		int sum1=1;
		for(int i=1; i<=pwr;i++){
			
			sum1=sum1*8;
		}
		return sum1;
	}
	
	
	public static void main(String[] args) {
		OctalToDeciConversion ob= new OctalToDeciConversion();
		System.out.println("Please enter the octal number to convert to Decimal");
		
		Scanner sc= new Scanner(System.in);
		
		int orgNumber= sc.nextInt();
		int tempNoToVerify= orgNumber;
		int sumTotal=0;
		int power=0;
		while(orgNumber>0){
			
			int digit=orgNumber%10;
			System.out.println(digit);
			int pwrOf10Value= ob.powerOf10Method(power);
			sumTotal= sumTotal+(digit)*pwrOf10Value;
			power++;
			orgNumber=orgNumber/10;
			
		}
		
		
		System.out.println("The Decimal equivalent of the Octal No "+tempNoToVerify+" =  "+sumTotal);
		
		
	}
	
}