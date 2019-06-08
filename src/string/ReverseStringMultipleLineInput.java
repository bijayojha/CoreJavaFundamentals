package string;

import java.io.*;

public class ReverseStringMultipleLineInput {
	public static void main(String[] args)throws IOException  {
		//Scanner sc =new Scanner(System.in);
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter the string to show the Reverse");
		
		String	myString= " "+ br.readLine();
		
		//System.out.println("You Have Entered This String : = "+myString);
		char charArrayOfStrMyString[]=myString.toCharArray();
		
		System.out.println("Below is the reverse of your String ");
		int tmpIndex=charArrayOfStrMyString.length;
		for(int i=charArrayOfStrMyString.length-1;i>=0;i--){
			//System.out.print(charArrayOfStrMyString[i]);
			
			if(charArrayOfStrMyString[i]==32){
				
				for(int j=i;j<tmpIndex;j++){
					System.out.print(charArrayOfStrMyString[j]);
				}
				tmpIndex=i;
				//System.out.println();
			}
			
		}
	
	}
	
}