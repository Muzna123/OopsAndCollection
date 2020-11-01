package CollectionList;

import java.util.ArrayList;

public class ListScript1 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(14);
		l.add(45);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.add(1,48);
		System.out.println(l);
		l.add(45);
		l.add(50);
		l.add(60);
		System.out.println(l);
		Object obj = l.get(3);
		System.out.println(obj);
		System.out.println(l.get(2));
		System.out.println(l.set(1, 500));
		System.out.println(l);
		l.add(1, 100);
		System.out.println(l);
		l.add(14);
		l.add(45);
		l.add("45");
		l.add("abc");
		l.add(45.24);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains(45));
		System.out.println(l.contains(6));
		System.out.println(l.add(14));
		System.out.println(l);
		
	}

}
