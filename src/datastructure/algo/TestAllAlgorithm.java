package datastructure.algo;

import java.util.Scanner;

public class TestAllAlgorithm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Store values to the data structure
		DataStructure dataStruct = new DataStructure();
		dataStruct.storeValuesToDataStructure();

		// Perform Linear Search on the above Data Structure
		
		/*System.out.println("Lets do the linear search on the Datastructure...");
		System.out.println("what do you want to search ?");
		int searchForValue = sc.nextInt();
		LinearSearch lnSearch = new LinearSearch();
		String results = lnSearch.performLinearSearch(searchForValue);
		if (results.equals(" ")) {
			System.out.println(
					"The element you are searching - " + searchForValue + "  is Not present in the data Structure");
		} else {
			System.out.println("The Element " + searchForValue + "  is present at the below locations in the DS");
			System.out.println(results);
		}*/
		
				
		
		// perform the Bubble Sort on the Data Structure
		/*System.out.println("Lets apply Bubble Sort on the DS");
		BubbleSort bSort=new BubbleSort();
		bSort.performBubbleSortOnDs();*/
		
	//	perform the Selection sort
	/*	
		SelectionSort selectionSortAlgo=new SelectionSort();
		selectionSortAlgo.insertionSort();*/
		
		
		
		
		// Perform Insertion Sort
		
	/*	InsertionSort inSortAlgo=new InsertionSort();
		inSortAlgo.insertionSort();*/
		
		//Perform Quick Sort
		
		/*QuickSort quickSort= new QuickSort();
		quickSort.quickSortAlgo();
		*/
		
		/// Quick Sort other method
		
		QuickSortOther quickSortOther=new QuickSortOther();
		quickSortOther.quickSortAlgo();
		

	}

}