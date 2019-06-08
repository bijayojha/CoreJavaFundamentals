package datastructure.algo;

public class QuickSort {
	int dsLength = DataStructure.dataStructure.length;

	//This Method is just to call the Quick Sort from outside of this class.. from this method calling to the actual quicksort algo with intial values array, 0, arraylenght
	void quickSortAlgo() {
		int left = 0;
		int right = dsLength - 1;
		quickSort(DataStructure.dataStructure, left, right);
		// show the values of the array after quick sort applied.
		System.out.println("Below is the DS after applying the quick Sort");
		for(int i=0;i<dsLength;i++)
			System.out.print(DataStructure.dataStructure[i]+"  ");
	}

	
	
	
	
	int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		};

		return i;
	}

	void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

}