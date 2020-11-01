package set;

import java.util.Comparator;
import java.util.TreeSet;

public class SetTree1 {
	public static void main(String[] args) {
		TreeSet set=new TreeSet(new MyComparator1());
		set.add(4);
		set.add(45);
		set.add(46);
		set.add(7);
		set.add(40);
		//set.add(null);
		System.out.println(set);
	}

}
class MyComparator1 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer obj1=(Integer)o1;
		Integer obj2=(Integer)o2;
		if(obj1<obj2)
			return 1;
		if(obj1>obj2)
			return -1;
		else
			return 0;
		//return -obj1.compareTo(obj2); for descending
		//return obj1.compareTo(obj2); for ascending
	}
}
