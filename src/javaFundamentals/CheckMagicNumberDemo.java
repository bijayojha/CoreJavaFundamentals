package javaFundamentals;

import java.util.Scanner;

public class CheckMagicNumberDemo {

	public static void main(String[] args) {
		System.out.println("Please enter the number to check for magic number or not");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int numCopy=num;
		
	int isMagic=checkMagic(num);
		if(isMagic==1){
			System.out.println(numCopy +"  is a Magic number ");
		}else{
			System.out.println(numCopy +"  is NOT a Magic number ");
		}

	}

	private static int checkMagic(int num) {
		int rem;
		int digitSum=0;
		
		while(num>0){
			rem=num%10;
			digitSum=digitSum+rem;
			num=num/10;
		
		}
		//System.out.println(digitSum);
		
	if(digitSum!=1)	
	  checkMagic(digitSum);
	 if(digitSum==1)
			return 1;
		else
			return digitSum;
		
	 
		 
					
		
	}
	}
