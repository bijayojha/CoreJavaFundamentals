package interview;

import java.util.Scanner;

public class TwoArrayDeclaraAndmanipulation {
	static int[][] twoDimArray;
	static Scanner sc;
	static int rowLen;
	static int colLen;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.println("enter the row and column length of the array");
		rowLen = sc.nextInt();
		colLen = sc.nextInt();
		twoDimArray = new int[rowLen][colLen];
		storeValInArray();
		printTheArrayVal();

	}

	private static void printTheArrayVal() {
		System.out.println("The Values in the 2D array are.. ");
		for (int i = 0; i < rowLen; i++) {
			for (int j = 0; j < colLen; j++) {
				System.out.print(twoDimArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void storeValInArray() {
		System.out.println("pelase privide " + rowLen * colLen + "  Values to the array");
		for (int i = 0; i < rowLen; i++) {
			for (int j = 0; j < colLen; j++)
				twoDimArray[i][j] = sc.nextInt();
		}

	}

}
