package interview;

public class FindMaxOccurOfArryInAnotherArr {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 1, 5, 6, 7, 1, 35, 6, 5 };
		int[] maxArr = { 8, 6,1,3 };
		int[] countArr = getCountArray(arr, maxArr);
		for (int val : countArr)
			System.out.println(val);
	}

	private static int[] getCountArray(int[] arr, int[] maxArr) {
		int tempArry[] = new int[maxArr.length];

		for (int i = 0; i < maxArr.length; i++) {
			int maxTocheck = maxArr[i];
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] <= maxTocheck) {
					count++;
				}
			}
			tempArry[i] = count;
		}

		return tempArry;
	}

}
