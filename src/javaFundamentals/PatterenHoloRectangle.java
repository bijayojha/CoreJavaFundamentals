package javaFundamentals;

import java.util.Scanner;

public class PatterenHoloRectangle {

	/* program to pring a pattern like rectangle */

	public static void main(String[] args) {
		System.out.println("Enter the Number of row");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of column");
		int row = sc.nextInt();
		int column = sc.nextInt();
		for (int i = 0; i < row; i++) {
			if (i == 0 | i == row - 1)
				printStar(column);
			else
				printSpace(column);

			System.out.println();
		}

	}

	static void printStar(int range) {
		for (int j = 0; j <= range; j++)
			System.out.print(" *");

	}

	static void printSpace(int range) {
		for (int i = 0; i <= range; i++)

			if (i == 0 || i == range)
				System.out.print(" *");
			else
				System.out.print("  ");
	}

}
