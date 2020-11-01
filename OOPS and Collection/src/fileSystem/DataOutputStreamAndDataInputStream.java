package fileSystem;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamAndDataInputStream {
public static void main(String[] args) throws IOException {
	DataOutputStream dos=new DataOutputStream(new FileOutputStream("abc.text"));
	dos.writeChar('A');
	dos.writeInt(45);
	dos.writeBoolean(false);
	dos.close();
	
	DataInputStream dis=new DataInputStream(new FileInputStream("abc.text"));
	char c = dis.readChar();
	int i = dis.readInt();
	boolean b = dis.readBoolean();
	System.out.println(c+" "+i+" "+b);
	dis.close();
	
}
}
