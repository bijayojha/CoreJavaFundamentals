package javaFundamentals;

import java.util.Scanner;

public class CheckDecimalDemo {
	
	
	int powerOf10Method(int pwr){
		int sum1=1;
		for(int i=1; i<=pwr;i++){
			
			sum1=sum1*10;
		}
		return sum1;
	}
	

	public static void main(String[] args) {
		CheckDecimalDemo ob= new CheckDecimalDemo();
		System.out.println("Please enter the number to verify for Decimal Or Not");
		
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
		
		if(tempNoToVerify==sumTotal){
			System.out.println(+tempNoToVerify+"  is a Decimal number");
		System.out.println(+sumTotal+"  is a Decimal number");
		}
		
	}
	
}