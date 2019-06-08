package javaFundamentals;

import java.util.Scanner;

public class MatrixMultiplicationDemo {

	static int matrixArray[][];
	static int fstArray[][];
	static int secArray[][];
	static Scanner sc;
	static String fstArr = "firstArray";
	static String secArr = "secondArray";
	static String matrixArr = "matrixMulArray";

	public static void main(String[] args) {

		MatrixMultiplicationDemo ob = new MatrixMultiplicationDemo();
		sc = new Scanner(System.in);
		System.out.println("Enter First Array Details");
		System.out.println("Please enter the row size of the First Matrix");
		int fstRowSize = sc.nextInt();
		System.out.println("Please enter the column size of the First Matrix");
		int fstColumnSize = sc.nextInt();
		fstArray = new int[fstRowSize][fstColumnSize];
		System.out.println("Enter Second Array Details");
		System.out.println("Please enter the row size of the Second Matrix");
		int secRowSize = sc.nextInt();
		System.out.println("Please enter the column size of the Second Matrix");
		int secColumnSize = sc.nextInt();
		secArray = new int[secRowSize][secColumnSize];

		matrixArray = new int[fstRowSize][secColumnSize];

		if (fstColumnSize != secRowSize) {
			System.out.println(
					"the column value of fisrt Matrix must be same with the Row value of second Matrix..  So exiting");
			System.exit(0);
		}

		/* read the first Array elements from command prompt */
		ob.readDataForMatrixFromCommand(fstRowSize, fstColumnSize, fstArr);
		/* read the second Array elements from command prompt */
		ob.readDataForMatrixFromCommand(secRowSize, secColumnSize, secArr);
		/*
		 * method to read the elements from the First matrix and show them in
		 * the console
		 */
		ob.showTheMatrixElement(fstRowSize, fstColumnSize, fstArr);
		/*
		 * method to read the elements from the Second matrix and show them in
		 * the console
		 */
		ob.showTheMatrixElement(secRowSize, secColumnSize, secArr);
		/* method to multiply the First and Second Matrix */
		ob.performTheMatrixMultiplication(fstRowSize, secColumnSize, fstColumnSize);
		/* show the Multiplication result of the two matrix */
		ob.showTheMatrixElement(fstRowSize, secColumnSize, matrixArr);

	}

	/*
	 * Method implementation to read the data from command prompt and put those
	 * values in the array which represents the Matrix
	 */

	void readDataForMatrixFromCommand(int rowSize, int columnSize, String arr) {
		System.out.println("Please enter " + (rowSize) * (columnSize) + "  elements to the matrix");
		for (int row = 0; row < rowSize; row++) {
			System.out.println("Enter " + columnSize + " elements for the " + (row) + " row");
			for (int col = 0; col < columnSize; col++) {

				if (arr.equals("firstArray"))
					fstArray[row][col] = sc.nextInt();
				else

					secArray[row][col] = sc.nextInt();
			}
		}

	}

	/*
	 * Method implementation to read the Matrix elements, i.e reading from the
	 * array
	 */

	void showTheMatrixElement(int rowSize, int columnSize, String arr) {
		System.out.println("Please find the below matrix");
		for (int row = 0; row < rowSize; row++) {

			for (int col = 0; col < columnSize; col++) {

				if (arr.equals("firstArray"))
					System.out.print("	" + fstArray[row][col] + " ");

				else {
					if (arr.equals("secondArray"))
						System.out.print("	" + secArray[row][col] + " ");
					else
						System.out.print("	" + matrixArray[row][col] + " ");
				}
			}
			System.out.println();
		}

	}
	/* Method implementation for multiplying the Two Matrix */

	void performTheMatrixMultiplication(int rowSize, int columnSize, int fstColumnSize) {

		for (int row = 0; row < rowSize; row++) {

			for (int col = 0; col < columnSize; col++) {
				matrixArray[row][col] = 0;
				for (int columnInfst = 0; columnInfst < fstColumnSize; columnInfst++) {

					matrixArray[row][col] = matrixArray[row][col]
							+ fstArray[row][columnInfst] * secArray[columnInfst][col];

				}
			}
		}
	}

}