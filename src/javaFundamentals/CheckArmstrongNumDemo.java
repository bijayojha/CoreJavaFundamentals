package javaFundamentals;

import java.util.Scanner;



/*An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits."
 * example */

public class CheckArmstrongNumDemo {
	
	public static void main(String[] args) {
		CheckArmstrongNumDemo checkAmsNum= new CheckArmstrongNumDemo();
		PowerOfNumDemo powOfNum= new PowerOfNumDemo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number to check amstrong or not");
		long orgNum= sc.nextLong();
		long tempNum= orgNum;
		
		long sumOfNthPowerOfEachDigit=0;
		int numLength=checkAmsNum.getNumLength(orgNum);
		
		while(orgNum>0){
			
			long digit=orgNum%10;		
			sumOfNthPowerOfEachDigit=sumOfNthPowerOfEachDigit+(powOfNum.findPowerOf(digit, numLength));
			orgNum=orgNum/10;
			
		}
		
		if(sumOfNthPowerOfEachDigit==tempNum)
			System.out.println(+tempNum+"  Is a amstrong number");
		else
			System.out.println(+tempNum+"  Is NOT a amstrong number");
		
	}
	
	
	
	/*Method implementation to count the length 0f number*/
	
	int getNumLength(long num){
				
				int count=0;
				while(num>0){
					
					num=num/10;
					count++;
				}
				return count;
			}

}