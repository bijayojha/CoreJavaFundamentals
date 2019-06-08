package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileByFileReader {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\radha","radha.txt");
		FileReader fr=new FileReader(f);
		
		char arrToStoreCharFromFile[]=new char[(int)f.length()];
		fr.read(arrToStoreCharFromFile);
		
		for(char ch: arrToStoreCharFromFile){
			
			System.out.print(ch);
		}
		
		
	}
} 