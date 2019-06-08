package string;

import java.util.Scanner;

public class ReverseStringByWordFromStart1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter the string to show the Reverse");
		
		String	myString= sc.nextLine()+" ";
		String[]  wordArray=myString.split(" ");
		System.out.println("Below is the reverse of your String ");
		String eachWord=null;
		for(int i=0;i<wordArray.length;i++){
					
			char[] arr=wordArray[i].toCharArray();
			for(int j=arr.length-1;j>=0;j--){
				System.out.print(arr[j]);
			}
			System.out.print(" ");
		}
	}
	
}