package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3};

		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		
		for(Integer val: arr)
			System.out.print(val);
		System.out.println();
		System.out.println(al);
		al.add(4);
		System.out.println(al);
		
		for(Integer val: arr)
			System.out.print(val);
		System.out.println(al);
	}
}
