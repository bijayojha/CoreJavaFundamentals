package string;

import java.util.Scanner;
public class UpperAndLowerCharInString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the string to check Lower and Upper Case count");
		String orgStr=sc.nextLine();
		int lowCaseCount=0;
		int uprCaseCount=0;
		
		for(int i=0;i<orgStr.length();i++){
			char ch=orgStr.charAt(i);
			if((ch>=65)&(ch<=90))
				uprCaseCount++;
			else
				if(ch!=32)
				lowCaseCount++;
			
			
		}
		System.out.println("Total Upper case Count = "+uprCaseCount);
		System.out.println("Total Lower case Count = "+lowCaseCount);
	}

}