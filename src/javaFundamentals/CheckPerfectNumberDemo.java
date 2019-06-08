package javaFundamentals;

import java.util.Scanner;

/*In number theory, a perfect number is a positive integer that is equal to the sum of its proper positive divisors,
 *  that is, the sum of its positive divisors excluding the number itself (also known as its aliquot sum). Equivalently, 
 * a perfect number is a number that is half the sum of all of its positive divisors (including itself) ex. */

public class CheckPerfectNumberDemo {

	public static void main(String[] args) {
		System.out.println("Please enter the range within which you want to see all the perfect number");
		Scanner sc = new Scanner(System.in);
		long range = sc.nextLong();

		for (long i = 1; i <= range; i++) {
			long sumOfDivisors = 0;
			long tempNum = i;

			for (long j = 1; j < i; j++) {

				if (i % j == 0) {

					sumOfDivisors = sumOfDivisors + j;
				}

			}
			// System.out.println(sumOfDivisors);
			if (sumOfDivisors == tempNum)
				System.out.println(+tempNum + "   is a perfect Number");

		}

	}

}