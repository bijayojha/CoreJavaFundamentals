package javaFundamentals;

import java.io.*;

public class FileDemo {
	public static void main(String args[]) throws IOException {
		String str = "Bijayand sabita bapi";
		char arr[] = str.toCharArray();
		File file = new File("C:/radha/", "Sabita.txt");
		FileOutputStream f = new FileOutputStream(file);

		for (int i = 0; i < arr.length; i++) {

			f.write(arr[i]);
		}

	}
}
