package string;

import java.util.StringTokenizer;

public class ReverseStringByWordFromStart2 {
	public static void main(String[] args) {

		String str = "how are you?";
		String sb;
		StringTokenizer token = new StringTokenizer(str, " ");
		while (token.hasMoreTokens()) {
			sb = token.nextToken();
			reverseString(sb);
		}

	}

	public static void reverseString(String orgstring) {
		for (int i = orgstring.length() - 1; i >= 0; i--) {
			System.out.print(orgstring.charAt(i));
		}
		System.out.print(" ");
	}
}