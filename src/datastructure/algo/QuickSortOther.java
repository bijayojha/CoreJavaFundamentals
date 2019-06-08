package datastructure.algo;

public class QuickSortOther {

	
	static int arr[]=DataStructure.dataStructure;
	int dsLength=arr.length;
	//This Method is just to call the Quick Sort from outside of this class.. from this method calling to the actual quick sort algo with intial values array, 0, arraylenght
		void quickSortAlgo() {
			int start = 0;
			int end = dsLength - 1;
		
			/**************************************/
			quickSort(arr , start, end);
			
			// show the values of the array after quick sort applied.
			System.out.println("Below is the DS after applying the quick Sort");
			for(int i=0;i<dsLength;i++)
				System.out.print(arr[i]+"  ");
		}
		
		
		
		void quickSort(int arr[], int start, int end){
			
			if(start<end){       // we will stop the recurssive call when we have a single element to partition
				int partitionIndex=doPartition(arr,start,end);
				quickSort(arr, start, partitionIndex-1);
				quickSort(arr,partitionIndex+1, end);
			}
		}
		
		int doPartition(int arr[],int start,int end){
			int pivot=arr[end];
			int partitionIndex=start;   // setting 	partition index as start initially
			for(int i=start;i<end;i++){
				
				if(arr[i]<=pivot){
					swapValue(arr,i,partitionIndex);   // swapping the values if element is lesser than Pivot
					partitionIndex++;
				}
			}
			swapValue(arr,partitionIndex,end);  // swap pivot with element at partition index.
			return partitionIndex;
		}
		
		void swapValue(int arr[],int i,int j){  // just separate method to swap the values in the array between two locations whenever necessary
			int tmpVal=arr[i];
			arr[i]=arr[j];
			arr[j]=tmpVal;
			
		}
}