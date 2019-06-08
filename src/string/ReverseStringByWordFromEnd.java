package string;

import java.util.Scanner;

public class ReverseStringByWordFromEnd {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter the string to show the Reverse");
		
		String	myString= " "+ sc.nextLine();
		
		char charArrayOfStrMyString[]=myString.toCharArray();
		
		System.out.println("Below is the reverse of your String ");
		int tmpIndex=charArrayOfStrMyString.length;
		for(int i=charArrayOfStrMyString.length-1;i>=0;i--){
					
			if(charArrayOfStrMyString[i]==32){
				
				for(int j=i;j<tmpIndex;j++){
					System.out.print(charArrayOfStrMyString[j]);
				}
				tmpIndex=i;
			}
			
		}
	
	}
	
}