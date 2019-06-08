package interview;

import java.util.Scanner;

public class ArrayDeclaraAndmanipulation {
	static int[] singArray;
	static Scanner sc;
	static int singArrayLen;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		singArrayLen = sc.nextInt();
		singArray = new int[singArrayLen];
		storeValInArray();
		printTheArrayVal();
		findGreatestVal();
		findLowestVal();
		findSumOfArray();

	}

	private static void findSumOfArray() {

		int sumOfArray = 0;
		for (int i = 0; i < singArray.length; i++) {
			sumOfArray = sumOfArray + singArray[i];
		}
		System.out.println("the sum of values of the array is " + sumOfArray);

	}

	private static void findLowestVal() {
		int lowVal = singArray[0];
		for (int i = 1; i < singArray.length; i++) {
			if (singArray[i] < lowVal) {
				lowVal = singArray[i];
			}

		}
		System.out.println("The lowest val in the array is -- " + lowVal);

	}

	private static void findGreatestVal() {
		int grtVal = singArray[0];
		for (int i = 1; i < singArray.length; i++) {
			if (singArray[i] > grtVal) {
				grtVal = singArray[i];
			}
			System.out.println();
		}
		System.out.println("the geratest value in the array is " + grtVal);

	}

	private static void printTheArrayVal() {
		System.out.println("The Values in the array are.. ");
		for (int i = 0; i < singArrayLen; i++) {

			System.out.print(singArray[i] + " ");
		}

	}

	private static void storeValInArray() {
		System.out.println("pelase privide " + singArrayLen + "  Values to the array");
		for (int i = 0; i < singArrayLen; i++) {
			singArray[i] = sc.nextInt();
		}

	}

}
