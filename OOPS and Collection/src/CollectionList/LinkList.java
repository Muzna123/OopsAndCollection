package CollectionList;

import java.util.LinkedList;

public class LinkList {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(45);
	l.add(12);
	l.add(89);
	l.add(456);
	System.out.println(l);
	l.addFirst(13);
	l.addLast(90);
	System.out.println(l);
	l.removeFirst();
    l.removeLast();
    System.out.println(l);
    System.out.println(l.getFirst());
    System.out.println(l.getLast());
    System.out.println(l.get(2));
}
}
