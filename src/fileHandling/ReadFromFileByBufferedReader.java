package fileHandling;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
public class ReadFromFileByBufferedReader {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\radha","radha.txt");
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		
		String str=(String)br.readLine();
		
		while(str !=null){
			
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
		
		
		
		
	}
}