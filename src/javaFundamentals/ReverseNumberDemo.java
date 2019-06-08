package javaFundamentals;

import java.util.Scanner;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		ReverseNumberDemo ob = new ReverseNumberDemo();
		System.out.println("Please enter the number to reverse");
		Scanner sc = new Scanner(System.in);
		int orgNumber = sc.nextInt();
		int tempNumber = orgNumber;

		int numLength = ob.getNumLength(orgNumber);
		System.out.println("the lenght of the number " + orgNumber + "  =  " + numLength);

		int arrToStoreNum[] = new int[numLength];
		// Storing each dight of the number into the array
		int arrIndexToStoreDigit = 0;
		while (orgNumber > 0) {

			arrToStoreNum[arrIndexToStoreDigit] = orgNumber % 10;
			orgNumber = orgNumber / 10;
			arrIndexToStoreDigit++;
		}
		System.out.println("please find the reverse of the number " + tempNumber);

		for (int i = 0; i < arrToStoreNum.length; i++)
			System.out.print(+arrToStoreNum[i]);

	}

	int getNumLength(int num) {

		int count = 0;
		while (num > 0) {

			num = num / 10;
			count++;
		}
		return count;
	}

}