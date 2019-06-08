package datastructure.algo;

public class InsertionSort {

	int dsLength = DataStructure.dataStructure.length;

	void insertionSort() {

		for (int i = 1; i < dsLength; i++) {

			int tmpVal;

			for (int j = i ; j > 0; j--) {

				if (DataStructure.dataStructure[j] < DataStructure.dataStructure[j-1]) {
					tmpVal = DataStructure.dataStructure[j];
					DataStructure.dataStructure[j] = DataStructure.dataStructure[j-1];
					DataStructure.dataStructure[j-1] = tmpVal;
				}
			}
		}
		
		System.out.println("Below is the DS after applying the Insertion Sort");
		for(int i=0;i<dsLength;i++)
			System.out.print(DataStructure.dataStructure[i]+"  ");
	}
}