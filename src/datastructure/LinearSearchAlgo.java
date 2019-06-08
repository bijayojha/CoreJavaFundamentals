package datastructure;

public class LinearSearchAlgo {
	static long startTime;
	static long endTime;
	
	public void linearSearchForValue(int value,DataStructureArray dsArray) {
	
		int arraySize = dsArray.theArray.length;
		boolean valueInDS = false;

		String indexsWithValue = "";
		
		startTime = System.currentTimeMillis();

		for (int i = 0; i < arraySize; i++) {

			if (dsArray.theArray[i] == value) {

				valueInDS = true;

				indexsWithValue += i + " ";

			}

		}

		System.out.println("Value Found: " + valueInDS);
		System.out.println("Values presents at location " + indexsWithValue);

		endTime = System.currentTimeMillis();

		System.out.println("Linear Search Took " + (endTime - startTime));

	}

}