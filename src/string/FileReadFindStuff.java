package string;

import java.util.StringTokenizer;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadFindStuff {

	public static void main(String[] args) throws IOException {
		String filePath=args[0];
		String fileName=args[1];
		
		File f=new File(filePath,fileName);
		BufferedReader br = new BufferedReader(new FileReader(f));
		
	
		
		String line=br.readLine();
		int lineCount=0;
		
		while(line !=null){
			
			 lineCount++;
			 showEachWordInLine(line);
			 reverseEachWordInLine(line);
			 
		
			line=br.readLine();
			
		}
		System.out.println("Total number of line presents in the file is ==  "+lineCount);
		br.close();
		
	}

	static void reverseEachWordInLine(String line) {
		 StringTokenizer st = new StringTokenizer(line," ");  
	     while (st.hasMoreTokens()) {  
	    	  StringBuffer buffer = new StringBuffer(st.nextToken());
	    	  String reverseWord = buffer.reverse().toString();
	    	  System.out.print(reverseWord+"  ");
	     }  
	}

	static void showEachWordInLine(String line) {
		 StringTokenizer st = new StringTokenizer(line," ");  
	     while (st.hasMoreTokens()) {  
	         System.out.print(st.nextToken());  
	     }  
		
	}
}