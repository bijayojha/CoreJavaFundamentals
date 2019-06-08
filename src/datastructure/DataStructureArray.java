package datastructure;

public class DataStructureArray {
	protected int[] theArray;
	static long startTime;
	static long endTime;

	DataStructureArray(int arraySize) {
		theArray = new int[arraySize];

		// initialize the array with random number

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() * 1000) + 10;

		}

	}

	public void addItemToArray(int location, int newItem)  {

		startTime = System.currentTimeMillis();
		
		theArray[location] = newItem;
		endTime = System.currentTimeMillis();
		System.out.println(" Time took for the array to store data is:-    " + (endTime - startTime));

	}

}