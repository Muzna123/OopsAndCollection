package set;

import java.util.LinkedHashSet;

public class SetHash {
	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		l.add(420);
		l.add(43);
		l.add(0);
		l.add(42);
		l.add(1);
		l.add(1);
		l.add(null);
		for(Object o:l)
			System.out.println(o);
	}

}
