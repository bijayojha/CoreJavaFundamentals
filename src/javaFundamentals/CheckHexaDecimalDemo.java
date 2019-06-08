package javaFundamentals;

import java.util.Scanner;

public class CheckHexaDecimalDemo {
	
	public static void main(String[] args) {
		CheckHexaDecimalDemo  ob= new CheckHexaDecimalDemo();
		System.out.println("Please Enter the number to check of Hexadecimal OR Not");
		Scanner sc= new Scanner(System.in);
		int base=0;
		int orgNum= sc.nextInt();
		int tempNumToVerify= orgNum;
		int arrToVerify[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int digit;
		
		int numLength= ob.getNumLength(orgNum);
		int count=0;
		while(orgNum>0){
			
			digit= orgNum%10;		
			for(int i=0; i<arrToVerify.length ;i++){
				if(arrToVerify[i]==digit){
					count++;
					}
			}// for loop end
	
			orgNum=orgNum/10;
		
		}	//while loop end	
		if(numLength==count)
			System.out.println("the given number " +tempNumToVerify+"  is a Hexadecimal number" );
		else
			System.out.println("the given number  " +tempNumToVerify+"  NOT a Hexadecimal  number" );
		
	}
	
	int getNumLength(int orgNum1){
		int count1=0;
		
	    while(orgNum1>0){
	    	orgNum1=orgNum1/10;
	    	count1++;
	     	
	    }
		return count1;
	}
	
	
	
	
}