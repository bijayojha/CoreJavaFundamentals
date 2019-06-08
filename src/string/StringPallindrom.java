package string;

import java.util.Scanner;

/*If the reverse of a string is same as the original string then the string is called a pallindrom */
public class StringPallindrom {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the string to check for pallindrom or not");
		String orgString= sc.nextLine();
		
		String reverseString= reverseTheString(orgString);
		System.out.println(reverseString);
		
		if(orgString.equals(reverseString))
			System.out.println(orgString+"  is a pallindrom string");
		else
			System.out.println(orgString+"  is Not a Pallindrom String");
		
	}
	
	
	static String reverseTheString(String orgString){
		
		char arrOfOrgString[]=orgString.toCharArray();
		String str="";
		for(int i=arrOfOrgString.length-1;i>=0;i--){
			str=str+arrOfOrgString[i];
		}
	  return str;
		
	}

}