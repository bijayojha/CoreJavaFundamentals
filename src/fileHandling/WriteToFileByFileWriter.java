package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileByFileWriter {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\radha","radha.txt");
		f.createNewFile();
		FileWriter fw= new FileWriter(f);
		fw.write("Bijay Kumar Ojha");
		fw.flush();
		fw.close();
	}

}