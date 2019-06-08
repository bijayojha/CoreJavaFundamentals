package string;

import java.util.Scanner;

public class ConsonantCheckInString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the string to check all the Consonants");
		String str= sc.nextLine();
		String myString=str.toLowerCase();
		System.out.println("You Have Entered This String : = "+myString);
		//int strLength=myString.length();
		char consonantArry[]={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		
		char charArrayOfStrMyString[]=myString.toCharArray();
		
		System.out.println("Below are the Consonants presents in the string ");
		
		for(int i=0;i<charArrayOfStrMyString.length;i++){
			
			for(int j=0;j<consonantArry.length;j++){
				if(charArrayOfStrMyString[i]==consonantArry[j]){
					
					System.out.println(charArrayOfStrMyString[i]);
				}
			}
		}
		
		
	}
	
}