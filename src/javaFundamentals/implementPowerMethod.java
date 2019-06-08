package javaFundamentals;

import java.util.Scanner;

public class implementPowerMethod {
	
	public static void main(String[] args) {
		System.out.println("please eneter the base and exponent");
		Scanner sc = new Scanner(System.in);
		
		int base=sc.nextInt();
		int exponent= sc.nextInt();
		int sum=1;
		
		for(int i=1; i<=exponent; i++){
			
			sum= sum*base;
			
			
		}
		System.out.println(sum);
	}

}