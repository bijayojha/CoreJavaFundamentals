package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		File f= new File("C://radha//radha.txt");
		
		FileReader fr= new FileReader(f);
		
		int charFromFile=fr.read();
		while(charFromFile!=-1){
			
			System.out.print((char)charFromFile);
			charFromFile=fr.read();
		}
		fr.close();
	}
}