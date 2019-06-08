package fileHandling;

import java.io.File;

public class FileDemoChkFileOrDir {
	public static void main(String[] args) {
		
		
		//File f=new File("C:\\radha");
		File f=new File("C:\\Windows\\System32");
		f.mkdir();
		String arrayFileName[]=f.list();
		//System.out.println(arrayFileName);
		
		for(String st: arrayFileName){
			File f1=new File(f,st);
			if(f1.isDirectory()){
				System.out.println(st+"   , is a Directory");
			}else
				if(f1.isFile()){
					System.out.println(st+"   , is a File");
				}
		}
		
		
	}

}