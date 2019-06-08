package datastructure.algo;

public class LinearSearch {

	String performLinearSearch(int valueToSearch) {

		String indexsWithValue = " ";

		for (int i = 0; i < DataStructure.dataStructure.length; i++) {

			if (DataStructure.dataStructure[i] == valueToSearch) {

				indexsWithValue += (i+1) + " ,  ";
			}

		}
		return indexsWithValue;
	}
}