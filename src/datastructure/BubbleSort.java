package datastructure;

public class BubbleSort {
	static long startTime;
	static long endTime;
	DataStructureArray dsArrayObj=null;
	public void bubbleSort(DataStructureArray dsArray) {
		dsArrayObj=dsArray;
		int arraySize=dsArray.theArray.length;
		
		startTime = System.currentTimeMillis();

		for (int i = arraySize - 1; i > 1; i--) {

			for (int j = 0; j < i; j++) {

				if (dsArray.theArray[j] > dsArray.theArray[j + 1]) {

					swapValues(j, j + 1);

				}

			}

		}

		endTime = System.currentTimeMillis();

		System.out.println("Bubble Sort Took " + (endTime - startTime));

	}
	public void swapValues(int indexOne, int indexTwo) {

		int temp = dsArrayObj.theArray[indexOne];

		dsArrayObj.theArray[indexOne] = dsArrayObj.theArray[indexTwo];

		dsArrayObj.theArray[indexTwo] = temp;

	}

}