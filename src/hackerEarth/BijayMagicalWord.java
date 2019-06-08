package hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BijayMagicalWord {
	public static void main(String[] args) throws Exception {

		System.out.println("Please enter the String");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String wordInput = br.readLine();
		String word = wordInput.toUpperCase();

		char arrOfChar[] = word.toCharArray();
		char resultArray[] = new char[arrOfChar.length];
		int asciiValOfChar;
		boolean prmOrNot;
		for (int i = 0; i < arrOfChar.length; i++) {
			asciiValOfChar = arrOfChar[i];
			prmOrNot = checkPrime(asciiValOfChar);
			if (prmOrNot == true) {
				resultArray[i] = (char) asciiValOfChar;
			} else {
				int nearestPrimenum = findNearestPrimeWithLowDistance(asciiValOfChar);
				resultArray[i] = (char) nearestPrimenum;
			}

		}

		for (int j = 0; j < resultArray.length; j++) {
			System.out.print(resultArray[j]);

		}

	}

	private static int findNearestPrimeWithLowDistance(int asciiValOfChar) {

		boolean prmOrNot1;
		int distOfPrmNumInFwrdDir = 0;
		int distOfPrmNumInBckdDir = 0;
		int prmNumInFrdwDir = 0;
		int prmNumInBckwdDir = 0;
		for (int i = asciiValOfChar; i <= 90; i++) {
			prmOrNot1 = checkPrime(i);
			if (prmOrNot1 == false) {
				distOfPrmNumInFwrdDir++;
				prmNumInFrdwDir = i;
				continue;
			} else {
				distOfPrmNumInFwrdDir++;
				prmNumInFrdwDir = i;
				break;
			}

		}
		for (int j = asciiValOfChar; j >= 65; j--) {
			prmOrNot1 = checkPrime(j);
			if (prmOrNot1 == false) {
				distOfPrmNumInBckdDir++;
				prmNumInBckwdDir = j;
				continue;
			} else {
				distOfPrmNumInBckdDir++;
				prmNumInBckwdDir = j;
				break;
			}

		}

		if (distOfPrmNumInFwrdDir == distOfPrmNumInBckdDir) {

			return prmNumInBckwdDir;
		} else {
			if (distOfPrmNumInBckdDir < distOfPrmNumInFwrdDir) {
				return prmNumInBckwdDir;
			} else
				return prmNumInFrdwDir;
		}

	}

	private static boolean checkPrime(int asciiValOfChar) {
		int countDevisor = 0;
		for (int i = 1; i <= asciiValOfChar; i++) {
			if (asciiValOfChar % i == 0) {
				countDevisor++;
			}

		}

		if (countDevisor == 2)
			return true;
		else
			return false;
	}

}