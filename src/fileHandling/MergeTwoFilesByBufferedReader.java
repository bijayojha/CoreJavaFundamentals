package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeTwoFilesByBufferedReader {
	
	public static void main(String[] args)throws IOException  {
		//Create two files
		
		File f1= new File("C:\\radha","radha1.txt");
		File f2= new File("C:\\radha","radha2.txt");
		
		File f9= new File("C:\\radha","radha9.txt");
		f1.createNewFile();
		f2.createNewFile();
		f9.createNewFile();
		
		BufferedReader br1= new BufferedReader(new FileReader(f1));
		BufferedReader br2= new BufferedReader(new FileReader(f2));
		
		BufferedWriter bw9= new BufferedWriter(new FileWriter(f9));
		
		String f1string=br1.readLine();
		String f2string=br2.readLine();
		
		
		while(f1string!=null){
			
			bw9.write(f1string);
			f1string=br1.readLine();
			System.out.println();
		}
		
		
		while(f2string!=null){
			
			bw9.write(f2string);
			f2string=br2.readLine();
		}
		br1.close();
		br2.close();
		bw9.close();
		
	}

}