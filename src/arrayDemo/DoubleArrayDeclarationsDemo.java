package arrayDemo;



public class DoubleArrayDeclarationsDemo {
	public static void main(String[] args) {
		// int arr[][] = new int[3][4];
		// int[][] arr1 = new int[3][4];
		int[][] arr2 = new int[3][4];
		int[] arr3[] = new int[3][4];
		int[][] arr4 = new int[3][4];
		int[] arr5[] = new int[3][4];

		// insert the values into the array
		int value = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr2[i][j] = value;
				value++;
			}
		}
		// Display the values present in the array

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr2[i][j] + "   ");
			}
			System.out.println();
		}

	}
}