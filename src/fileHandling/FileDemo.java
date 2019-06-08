package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\radha","radha.txt");
		File f1=new File("C:\\radha","radha1.txt");
		File f2=new File("C:\\radha","radha2.txt");
		File f3=new File("C:\\radha","radha3.txt");
		File f4=new File("C:\\radha","radha4.txt");
		File f5=new File("C:\\radha","radha5.txt");
		File f6=new File("C:\\radha","radha6.txt");
		
		f.createNewFile();
		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		f4.createNewFile();
		f5.createNewFile();
		f6.createNewFile();
		
		
		boolean b= f.exists();
		boolean dir= f.isDirectory();
		boolean fil=f.isFile();
		System.out.println("Does the file/Dir Exist:- "+b);
		System.out.println("Is this a directory :- "+dir);
		System.out.println("Is this a File :- "+fil);
	
		
		File f7=new File("C:\\radha\\krishna","krishna");
		//f7.mkdir();
		f7.createNewFile();
		
	}
}