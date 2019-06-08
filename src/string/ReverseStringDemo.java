package string;


import java.util.Scanner;

public class ReverseStringDemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the string to show the Reverse");
		String myString= sc.nextLine();
	
		
		System.out.println("You Have Entered This String : = "+myString);
		char charArrayOfStrMyString[]=myString.toCharArray();
		
		
		System.out.println("Below is the reverse of your String ");
		
		for(int i=charArrayOfStrMyString.length-1;i>=0;i--){
			System.out.print(charArrayOfStrMyString[i]);
			
		}
		
		
	}
	
}