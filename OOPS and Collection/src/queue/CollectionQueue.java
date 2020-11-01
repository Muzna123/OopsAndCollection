package queue;

import java.util.PriorityQueue;

public class CollectionQueue {
	public static void main(String[] args) {
		//LinkedList l=new LinkedList();
		//Que l=new Que();
		PriorityQueue l=new PriorityQueue();
		l.add(12);
		l.add(97);
		l.add(45);
		l.add(78);
		l.add(41);
		l.add(172);
		System.out.println(l);
		System.out.println("Peek: "+l.peek());
		System.out.println("Poll: "+l.poll());
		System.out.println("Element: "+l.element());
		System.out.println("Remove: "+l.remove());
		System.out.println(l);
	}

}
