package javaFundamentals;

import java.util.Scanner;

public class MultiplicationTableDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" you want multiplication table up to what number ? ");
		int multiOf = sc.nextInt();
		System.out.println("Up to what number you want to print the multiplication table");

		int uptoWhatNumber = sc.nextInt();
		System.out.println("Please find the below Multiplication Table");
		for (int i = 0; i <= multiOf; i++) {
			for (int j = 0; j <= uptoWhatNumber; j++) {

				System.out.println("	 " + i + "  *  " + j + "      =  " + (i * j));
			}

			System.out.println();
		}

	}

}