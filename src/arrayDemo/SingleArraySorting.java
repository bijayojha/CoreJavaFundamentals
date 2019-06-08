package arrayDemo;

import java.util.Scanner;

public class SingleArraySorting {
	static Scanner sc;
	static int[] arrToStore;
	static int arrSize;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		arrSize = sc.nextInt();
		arrToStore = new int[arrSize];

		// read the values from the console and put those values in the array
		readValFromConsPutInArry();

		// read the values from the array and show in the console
		showArray();
		// find the Greatest element present in the array
		int grtElement = findGreatesttElement();
		System.out.println("The Greatest element in the array is  " + grtElement);
		// find the Smallest element present in the array
		int smlstElement = findSmallestElement();
		System.out.println("The Smallest element in the array is  " + smlstElement);
		// Sort the array in ascending order
		sortArrayAscending();

	}

	static void readValFromConsPutInArry() {
		System.out.println("Please provide " + "  " + arrSize + "  elements to the array");
		for (int i = 0; i < arrToStore.length; i++) {
			arrToStore[i] = sc.nextInt();

		}
	}

	static void showArray() {
		System.out.println("Here is your Array Elements");
		for (int j = 0; j < arrToStore.length; j++) {
			System.out.print(arrToStore[j] + "   ");

		}
		System.out.println();
	}

	static int findGreatesttElement() {

		int grtst = arrToStore[0];
		for (int i = 1; i < arrToStore.length; i++) {
			if (arrToStore[i] > grtst) {

				grtst = arrToStore[i];
			}

		}
		return grtst;
	}

	static int findSmallestElement() {

		int smlst = arrToStore[0];
		for (int i = 1; i < arrToStore.length; i++) {
			if (arrToStore[i] < smlst) {

				smlst = arrToStore[i];
			}

		}
		return smlst;
	}

	static void sortArrayAscending() {
		for (int i = 0; i < arrToStore.length; i++) {
			for (int j = i + 1; j < arrToStore.length; j++) {
				if (arrToStore[i] > arrToStore[j]) {
					int tempElement = arrToStore[i];
					arrToStore[i] = arrToStore[j];
					arrToStore[j] = tempElement;

				}
			}

		}
		System.out.println("Here is your array after sorting in Ascending Order");
		showArray();

	}
}