package javaFundamentals;

import java.util.Scanner;

public class ReverseNumberDemoOtherLogic {

	public static void main(String[] args) {
		ReverseNumberDemoOtherLogic ob= new ReverseNumberDemoOtherLogic();
		System.out.println("Please enter the number to reverse");
		Scanner sc= new Scanner(System.in);
		int orgNumber= sc.nextInt();
		int tempNumber=orgNumber;
		
		int numLength=ob.getNumLength(orgNumber);
		int sum=0;
		
		while(orgNumber>0){
			int digit=orgNumber%10;
			sum=sum+digit*(ob.powerOf10Method(--numLength));
			orgNumber=orgNumber/10;
			}
		
			System.out.println("the reverse of "+tempNumber+" == "+sum);
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
	
		
	
