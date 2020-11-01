package fileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamAndFileOutputStream {
	public static void main(String[] args) throws IOException {
	/*	FileInputStream fis = new FileInputStream("abc.text");
			
			
			  char c=(char)fis.read(); 
			  System.out.println(c);
			 
			
			int data;
			while((data=fis.read())!=-1)
				System.out.print((char)data);
			
			
			
			byte b[]=new byte[4];
			fis.read(b);
			for(byte k:b)
				System.out.print((char)k);
			
			System.out.println();
			
			fis.read(b,1,2);
			for(byte k:b)
				System.out.print((char)k);
			fis.close();*/

		FileOutputStream fos=new FileOutputStream("abc.text");
		fos.write(104);
		fos.close();
		
		FileInputStream fis1=new FileInputStream("abc.text");
		int data1 = fis1.read();
		System.out.print((char)data1);
		fis1.close();
	}
}
