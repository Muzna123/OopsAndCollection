package fileSystem;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndFileReader {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.text");
		fw.write(100);
		fw.write('\n');
		char[] ch= {'a','b','c','d'};
		fw.write(ch);
		fw.write('\n');
		String s="this is Filewriter";
		fw.write(s);
		fw.write('\n');
		fw.flush();
		fw.close();
		
		
		FileReader fr=new FileReader("abc.text");
		int i = fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			 i = fr.read();
		}
		System.out.println();
		
		File f=new File("abc.text");
		FileReader fr1=new FileReader(f);
		char[] ch1=new char[(int)f.length()];
		fr1.read(ch1);
		for(char c:ch1)
			System.out.print(c);
	}

}
