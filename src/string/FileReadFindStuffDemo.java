package string;

import java.util.StringTokenizer;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadFindStuffDemo {
	static int lineCount=0;
	static int wordCount=0;
	static int charCount=0;
	static int vowelCount=0;
	static int consonantCount=0;
	
	public static void main(String[] args) throws IOException {
		File f=new File(args[0],args[1]);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line=br.readLine();
				
		while(line !=null){
			 lineCount++;
			 doStuff(line);
			 line=br.readLine();
		}
		System.out.println("Total number of line  presents in the file is ==  "+lineCount);
		System.out.println("Total number of Word  presents in the file is ==  "+wordCount);
		System.out.println("Total number of Char  presents in the file is ==  "+charCount);
		System.out.println("Total number of Vowel presents in the file is ==  "+vowelCount);
		System.out.println("Total number of Consonant  presents in the file is ==  "+(charCount-vowelCount));
		br.close();
		
	}

	private static void doStuff(String line) {
		//Print Each Line
		System.out.println(line);
		//list and count each words in the line
		StringTokenizer str=new StringTokenizer(line, " ");
		String word;
		while(str.hasMoreTokens()){
			wordCount++;
			word=str.nextToken();
			//System.out.print(word);
			charCount=charCount+word.length();
			for(int i=0;i<word.length();i++){
				if(word.charAt(i)=='a' ||word.charAt(i)=='e'|| word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='A' ||word.charAt(i)=='E'|| word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U'){
					vowelCount++;
				}
				
			}
			
		}
		
	}

	
}