package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQue {
	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add(12);
		q.add(12);
		q.add("java");
		q.add(null);
		q.add("mava");
		q.add(172);
		q.add(145);
		q.add(12);
		System.out.println(q);
		System.out.println("Peek: "+q.peek());
		System.out.println("Poll: "+q.poll());
		System.out.println("Element: "+q.element());
		System.out.println("Remove: "+q.remove());
		System.out.println(q);
	}

}
