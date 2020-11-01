package set;

import java.util.Comparator;
import java.util.TreeSet;

class SetTree {
	public static void main(String[] args) {
		TreeSet s=new TreeSet(new MyComparator());
		s.add(new StringBuffer("z"));
		s.add(new StringBuffer("b"));
		s.add(new StringBuffer("h"));
		s.add(new StringBuffer("k"));
		s.add(new StringBuffer("z"));
		System.out.println(s);
	}
}
class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String obj1=(String)o1;
		String obj2=(String)o2;
		return -obj1.compareTo(obj2);
		//return obj1.compareTo(obj2);
	}
}

