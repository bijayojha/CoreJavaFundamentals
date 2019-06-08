package javaFundamentals;

import java.util.Scanner;

public class PrimeCheckDemo {


	
public static void main(String[] args) {
	System.out.println("Please enter the range to check all the  Prime numbers in that ");
	Scanner sc = new Scanner(System.in);	
	int range=sc.nextInt();
	int numToCheck=1;
	
	for (int j=numToCheck;j<=range;j++){
		int countNoOfRemainder=0;
		for (int i = 1; i <=j; i++) {
				if(j%i==0)			
					countNoOfRemainder++;
			}
	
		if(countNoOfRemainder==2){
			System.out.println(j +" Is a prime number");
			
			
		}
	}
	
	
 }

}