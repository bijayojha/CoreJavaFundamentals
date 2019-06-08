package collection;

import java.util.HashMap;

public class FindPairSumToGivenNumInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 1, 5, 6, 8 };
		int chkNum = 11;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length - 1; i++) {
			hashMap.put(arr[i], i);
		}
		System.out.println(hashMap);
		
		for (int j = 0; j < arr.length-1; j++) {
			if(hashMap.get(chkNum-arr[j])!=j){
				System.out.println("Pair ("+j+" , "+hashMap.get(chkNum-arr[j])+" Has Sum "+chkNum);
			}
			
		}
	}

}


