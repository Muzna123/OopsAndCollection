package CollectionList;

import java.util.Enumeration;
import java.util.Vector;

public class Vlist {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(40);
		v.add(45.63);
		v.add("Hi");
		v.add(true);
		v.add(12);
		v.add(null);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		//for(Object o:v)
			//System.out.println(o);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}

}
