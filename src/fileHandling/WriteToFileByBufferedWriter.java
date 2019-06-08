package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFileByBufferedWriter {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\radha","radha.txt");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		
		bw.write("Bijay");
		bw.newLine();
		bw.write("Kumar");
		bw.write(100);
		
		bw.close();
	}
	
}