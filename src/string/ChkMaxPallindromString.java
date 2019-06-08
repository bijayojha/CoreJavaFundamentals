package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChkMaxPallindromString {
	static HashMap<String, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the string to check heighest pallindeom present in that ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String orgString = br.readLine();

		for (int i = 0; i < orgString.length(); i++) {
			for (int j = i + 1; j <= orgString.length(); j++) {
				String str = orgString.substring(i, j);
				// System.out.println(str);
				checkPalliondromAndStore(str);

			}
		}
		System.out.println(map);
		showTheLongestPallindrom();
		//logic to handel if there are multiple highest pallindrom with same length exist, need to be implemented

	}

	static void checkPalliondromAndStore(String strSubString) {
		String strToChek = strSubString;
		char arrOfOrgString[] = strSubString.toCharArray();
		String str = "";
		for (int i = arrOfOrgString.length - 1; i >= 0; i--) {
			str = str + arrOfOrgString[i];
		}
		if ((strToChek.length() != 1) & (strToChek.equals(str))) {

			map.put(strToChek, strToChek.length());
		}

	}

	// show the longest pallindrom
	public static void showTheLongestPallindrom() {
		Iterator itr = map.entrySet().iterator();
		int hstpalliLength = 0;
		String longestPalin = null;
		while (itr.hasNext()) {
			Map.Entry lonfPaliAndLeng = (Map.Entry) itr.next();
			int palliLength = (int) lonfPaliAndLeng.getValue();
			if (palliLength >= hstpalliLength) {

				longestPalin = (String) lonfPaliAndLeng.getKey();
				hstpalliLength = palliLength;
			}

		}

		System.out.println("Longest Pallindeom == " + longestPalin + "  Length ==  " + hstpalliLength);
	}

}