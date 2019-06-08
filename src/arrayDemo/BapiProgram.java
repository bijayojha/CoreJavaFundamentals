package arrayDemo;

import java.util.Scanner;

public class BapiProgram {

	static int chk4InPrime;

	public static void main(String[] args) {
		System.out.println("Please enter the range ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int numToCheck = 1;

		for (int j = numToCheck; j <= range; j++) {
			int countNoOfRemainder = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0)
					countNoOfRemainder++;
			}

			if (countNoOfRemainder == 2) {
				System.out.print(j + "  cube is == ");
				int cubeValue = findCubeOfPrime(j);
				System.out.print(cubeValue);
				count4InCubeOfPrimeNumber(cubeValue);
				System.out.println();
			}
		}

		System.out.println("The total Number of 4 present == " + chk4InPrime);
	}

	static int findCubeOfPrime(int base) {
		int sum = 1;

		for (int i = 1; i <= 3; i++) {

			sum = sum * base;
		}
		return sum;

	}

	static void count4InCubeOfPrimeNumber(int cubeValue) {

		while (cubeValue > 0) {

			int digit = cubeValue % 10;
			if (digit == 4) {

				chk4InPrime++;
			}

			cubeValue = cubeValue / 10;

		}

	}

}
