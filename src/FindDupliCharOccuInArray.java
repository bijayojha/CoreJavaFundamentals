import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDupliCharOccuInArray {
	public static void main(String args[]) {
		char arr[] = { 'a', 'b', 'c', 'a', 'b', 'c', 'c', 'd', 'a', 'c', 'd' };
		HashMap<String, Integer> map = new HashMap<>();
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			String key = Character.toString(arr[i]);
			if (!map.containsKey(key))
				map.put(key, count);
			else
				map.put(key, map.get(key) + 1);
		}
		System.out.println(map);

	}

	// using java 8
	// map.forEach((key,value) -> System.out.println(key + " = " + value));

}
