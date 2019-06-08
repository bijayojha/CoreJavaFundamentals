package fileHandling;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;


public class ChkDupli_MOB_Num_In_Two_File {
	
	public static void main(String[] args)throws IOException  {
		//Create two files
		
		File f1= new File("C:\\radha","mobile1.txt");
		File f2= new File("C:\\radha","mobile2.txt");
		
		f1.createNewFile();
		f2.createNewFile();
		
		BufferedReader br1= new BufferedReader(new FileReader(f1));
				
		String line1=br1.readLine();
		String line2;
		
		while(line1!=null){
			
			BufferedReader br2= new BufferedReader(new FileReader(f2));
			line2=br2.readLine();
			
			while(line2!=null){
				
				if(line1.equals(line2)){
					System.out.println(line1+" is present in file2 ");
					
				}
				line2=br2.readLine();
				
			}
			br2.close();
			line1=br1.readLine();
			
		}
		
		
		br1.close();
			
	}

}