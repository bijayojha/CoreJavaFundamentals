package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTwoFilesByPrintWriter {
	
	public static void main(String[] args)throws IOException  {
		//Create two files
		
		File f1= new File("C:\\radha","radha1.txt");
		File f2= new File("C:\\radha","radha2.txt");
		
		File f9= new File("C:\\radha","radha9.txt");
		f1.createNewFile();
		f2.createNewFile();
		f9.createNewFile();
		
		BufferedReader br= new BufferedReader(new FileReader(f1));
		
		
		PrintWriter pw=new PrintWriter(new FileWriter(f9));
		
		String line=br.readLine();
				
		//reading the first file line by line and writing each line to the third file
		while(line!=null){
			
			pw.println(line);
			line=br.readLine();
			//System.out.println();
		}
		
		//reading the second file line by line and writing each line to the third file
		br= new BufferedReader(new FileReader(f2));
		line=br.readLine();
		while(line!=null){
			
			pw.println(line);
			line=br.readLine();
		}
		br.close();
		
		pw.close();
		
	}

}