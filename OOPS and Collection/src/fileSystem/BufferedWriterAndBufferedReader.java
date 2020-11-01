package fileSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterAndBufferedReader {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.text");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch= {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		String s="this is Filewriter";
		bw.write(s);
		bw.newLine();
		bw.flush();
		bw.close();
		
		
		FileReader fr=new FileReader("abc.text");
		BufferedReader br=new BufferedReader(fr);
		int i = br.read();
		while(i!=-1) {
			System.out.print((char)i);
			 i = br.read();
		}
		System.out.println();
		
		File f=new File("abc.text");
		FileReader fr1=new FileReader(f);
		BufferedReader br1=new BufferedReader(fr1);
		char[] ch1=new char[(int)f.length()];
		br1.read(ch1);
		for(char c:ch1)
			System.out.print(c);
		
		FileReader fr2=new FileReader("abc.text");
		BufferedReader br2=new BufferedReader(fr2);
		String line = br2.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br2.readLine();
		}
		br2.close();
	}

}
