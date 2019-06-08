package string;

import java.util.Scanner;

public class StrCharAsciiValueDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to find ASCII value");
		String orgStr = sc.nextLine();

		/*for (int i = 0; i < orgStr.length(); i++) {
			char ch = orgStr.charAt(i);
			System.out.println("ASCII Value of  "+ch+" = "+(int)ch);

		}*/
		
		for (int i = 0; i < 1000; i++) {
			
			System.out.println((char)i+"  ==  "+i);
		}
	}

}