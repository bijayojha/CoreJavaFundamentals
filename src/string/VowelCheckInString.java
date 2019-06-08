package string;

import java.util.Scanner;

public class VowelCheckInString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the string to check all the vowels");
		String str= sc.nextLine();
		String myString=str.toLowerCase();
		System.out.println("You Have Entered This String : = "+myString);
		//int strLength=myString.length();
		char vowelArry[]={'a','e','i','o','u'};
		
		char charArrayOfStrMyString[]=myString.toCharArray();
		
		System.out.println("Below are the Vowels presents in the string ");
		
		for(int i=0;i<charArrayOfStrMyString.length;i++){
			
			for(int j=0;j<vowelArry.length;j++){
				if(charArrayOfStrMyString[i]==vowelArry[j]){
					
					System.out.println(charArrayOfStrMyString[i]);
				}
			}
		}
		
		
	}
	
}