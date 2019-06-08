package javaFundamentals;

import java.util.Scanner;




/*An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits."
 * example */

public class CheckArmstrongNumWithInRangeDemo {
	
	public static void main(String[] args) {
		CheckArmstrongNumWithInRangeDemo checkAmsNum= new CheckArmstrongNumWithInRangeDemo();
		PowerOfNumDemo powOfNum= new PowerOfNumDemo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the Range within which you want all the  amstrong number");
		long range=sc.nextLong();
		
		for(long numToTest=1;numToTest<=range;numToTest++){
		
					long orgNum= numToTest;
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
					//else
						//System.out.println(+tempNum+"  Is NOT a amstrong number");
					
	}//end of for loop
		
}//end of main method
	
	
	
	
	
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