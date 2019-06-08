package datastructure;

public class BigONotationTest {
	
	public static void main(String args[]){
	
	DataStructureArray dsArray1=new DataStructureArray(52200);
	DataStructureArray dsArray2=new DataStructureArray(80000);
	DataStructureArray dsArray3=new DataStructureArray(200000);
	DataStructureArray dsArray4=new DataStructureArray(2000888);
	DataStructureArray dsArray5=new DataStructureArray(10000);
	
	
	// O(1) An algorithm that executes in the same time regardless of the amount of data This code executes in the same amount of time no matter how big the array is
	
	/*dsArray1.addItemToArray(15061, 541);
	dsArray2.addItemToArray(15061, 542);
	dsArray3.addItemToArray(10, 543);
	dsArray4.addItemToArray(15555, 544);
	dsArray5.addItemToArray(9000, 545);*/
	
	/* 0(N) An algorithm thats time to complete will grow in direct proportion to the amount of data The linear search is an example of this
		To find all values that match what we are searching for we will have to look in exactly each item in the array If we just wanted to find one match the Big O
		is the same because it describes the worst case scenario in which the whole array must be searched */
	
	
	LinearSearchAlgo lsAlgo= new LinearSearchAlgo();
	
	lsAlgo.linearSearchForValue(10,dsArray1);
	lsAlgo.linearSearchForValue(10,dsArray2);
	lsAlgo.linearSearchForValue(10,dsArray3);
	lsAlgo.linearSearchForValue(10,dsArray4);
	lsAlgo.linearSearchForValue(10,dsArray5);
	
	/*O(N^2) Time to complete will be proportional to the square of the amount of data (Bubble Sort) Algorithms with more nested iterations will result
	in O(N^3), O(N^4), etc. performance Each pass through the outer loop (0)N requires us  to go through the entire list again so N multiplie against itself or it is squared
	*/
	
	/*BubbleSort bsAlgo= new BubbleSort();
	bsAlgo.bubbleSort(dsArray1);
	bsAlgo.bubbleSort(dsArray2);
	bsAlgo.bubbleSort(dsArray3);
	bsAlgo.bubbleSort(dsArray4);
	bsAlgo.bubbleSort(dsArray5);*/
	
	
  }
}