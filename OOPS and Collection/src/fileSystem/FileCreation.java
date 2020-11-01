package fileSystem;

import java.io.File;
import java.io.IOException;

public class FileCreation {
public static void main(String[] args) throws IOException {
	File f=new File("abc.text");
	System.out.println(f.exists());
	f.createNewFile();
	System.out.println(f.exists());
	System.out.println(f.getAbsolutePath());
	File f1=new File("C:\\Users\\91886\\eclipse-workspace\\OOPS and Collection");
	String[] list = f1.list();
	for(String s:list) {
	File f2=new File(f1,s);
//		if(f2.isFile()) {
//			System.out.println(f2.getName());
//		}
	
	   if(f2.isDirectory())
		   System.out.println(f2.getParent());
			
	}
}
}
