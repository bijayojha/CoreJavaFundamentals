package string;

import java.util.Scanner;
/*a space complexity of O(1) means that the space required by the algorithm to process data is constant; 
 * it does not grow with the size of the data on which the algorithm is operating.*/

public class FindFstNonRepeatChar {

	public static void main(String[] args) {
		System.out.println("Please Enter the string.. ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
			int  nonRptPlace=0;
			char nonRptChr=str.charAt(nonRptPlace);
			if(str.charAt(i)!=str.charAt(i+1)){
				nonRptChr=str.charAt(i);
				nonRptPlace=i;
			}
		}
		

	}
}