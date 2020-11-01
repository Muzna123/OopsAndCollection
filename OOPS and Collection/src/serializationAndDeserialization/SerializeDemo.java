package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
	    Dog d1=new Dog();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		oos.close();
		fos.close();
		
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println(d2.i+"   "+d2.j);
		ois.close();
		fis.close();
	}
}
