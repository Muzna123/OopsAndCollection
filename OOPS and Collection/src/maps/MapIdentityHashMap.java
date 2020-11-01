package maps;

import java.util.IdentityHashMap;

public class MapIdentityHashMap {
	public static void main(String[] args) {
		IdentityHashMap m=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Integer i3=20;
		Integer i4=20;
		m.put(i1, "Hi");
		m.put(i2, "Hello");
		m.put(i3, "Good");
		m.put(i4, "Bad");
		System.out.println(m);
		
	}

}
