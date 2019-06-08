package string;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
imports for BufferedReader*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;

public class LtoUandUtoLOfCharOfWord {

	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running Use either of
		 * these methods for input
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Plz enter the string");
		String line = br.readLine();
		
		char orgArr[] = line.toCharArray();
		char ch;
		char resultArr[] = new char[orgArr.length];

		for (int i = 0; i < orgArr.length; i++) {
			ch = orgArr[i];

			if ((ch >= 65) & (ch < 97)) {
				ch = (char) (ch + 32);
				resultArr[i] = ch;
			} else {
				resultArr[i] = (char) (ch - 32);

			}

		}

		System.out.println("Below is your Word after converting each character from lower to upper and vice versa");
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i]);
		}
	}
}