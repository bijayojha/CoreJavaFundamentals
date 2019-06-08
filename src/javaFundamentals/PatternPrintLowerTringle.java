package javaFundamentals;

import java.util.Scanner;

/* program to pring a pattern like tringle */

public class PatternPrintLowerTringle {
	public static void main(String[] args) {
		System.out.println("Enter the Number of row");
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		

		for (int i = row; i >= 0; i--) {

			printSpace(row - i);
			printStar(i);

			System.out.println();
		}
	
	}

	static void printSpace(int spaceRange) {
		for (int j = 0; j <= spaceRange; j++)
			System.out.print(" ");

	}

	static void printStar(int starRange) {
		for (int i = 0; i < ((2 * starRange) + 1); i++)
			System.out.print("*");
	}

}