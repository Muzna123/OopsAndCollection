package maps;

import java.util.Comparator;
import java.util.TreeMap;

public class MapTree {
	public static void main(String[] args) {
	TreeMap m=new TreeMap();
	m.put(10,"k");
	m.put(42,"4");
	m.put(5,"k");
	m.put(12,12);
	System.out.println(m);
   TreeMap m1=new TreeMap(new MyComparator());
   m1.put(10,"k");
   m1.put(42,4);
   m1.put(5,"k");
   m1.put(12,12);
   System.out.println(m1);
	
	}	

}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return -i1.compareTo(i2);
	}
}
