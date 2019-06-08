package javaFundamentals;

import java.util.Scanner;

public class PallindromNumCheckDemo {

	public static void main(String[] args) {
		PallindromNumCheckDemo ob= new PallindromNumCheckDemo();
		System.out.println("Please enter the range with in which you want to see all the  Pallindrom number ");
		Scanner sc= new Scanner(System.in);
		
		int range= sc.nextInt();
		
		for (int i=0;i<range;i++){
		int orgNumber= i;
		int tempNumber=orgNumber;
		
		int numLength=ob.getNumLength(orgNumber);
		int sum=0;
		
		while(orgNumber>0){
			int digit=orgNumber%10;
			sum=sum+digit*(ob.powerOf10Method(--numLength));
			orgNumber=orgNumber/10;
			}
		if(sum==tempNumber){
			System.out.println("the reverse of "+tempNumber+" == "+sum+"   (So Pallindrom Number)");
			
			}
		}
	}
		
	
	
	 /*Method implementation to count the length 0f number*/
	
		int getNumLength(int num){
					
					int count=0;
					while(num>0){
						
						num=num/10;
						count++;
					}
					return count;
				}
				
				
	/*Method implementation to calculate the power of a number*/
		int powerOf10Method(int pwr){
					int sum1=1;
					for(int i=1; i<=pwr;i++){
						
						sum1=sum1*10;
					}
					return sum1;
				}
			
		
		
	}
