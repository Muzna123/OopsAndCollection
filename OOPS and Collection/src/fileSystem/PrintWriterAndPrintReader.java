package fileSystem;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterAndPrintReader {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("abc.text");
		pw.print(100);
		pw.print('c');
		pw.print(52.2);
		pw.print(true);
		pw.print("Muzna");
		pw.println();
		pw.println(100);
		pw.println('c');
		pw.println(52.2);
		pw.println("Muzna");
		pw.println(true);
		pw.close();	  	
	}


}
