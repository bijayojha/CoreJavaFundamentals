package datastructure.algo;

public class SelectionSort {

	int dsLength = DataStructure.dataStructure.length;

	void insertionSort() {

		for (int i = 0; i < dsLength; i++) {
			int tmpVal;
			for (int j = i + 1; j < dsLength; j++) {

				if (DataStructure.dataStructure[i] > DataStructure.dataStructure[j]) {

					tmpVal = DataStructure.dataStructure[i];
					DataStructure.dataStructure[i] = DataStructure.dataStructure[j];
					DataStructure.dataStructure[j] = tmpVal;
				}
			}

		}
		
		
		System.out.println("Please find the below sorted Ds after aplying the insertion sort");
		for (int i = 0; i < dsLength; i++)
			System.out.print(DataStructure.dataStructure[i]+"  ");

	}
	
	
}