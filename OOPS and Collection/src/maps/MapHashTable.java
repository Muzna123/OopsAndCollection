package maps;

import java.util.Hashtable;

public class MapHashTable {
	public static void main(String[] args) {
		Hashtable m=new Hashtable();
		m.put(4, "Hi");
		m.put("janvi", 5);
		m.put("New", "Hi");
		//m.put(null, "Hi");
		//m.put(4, null);
		System.out.println(m);
	}

}
