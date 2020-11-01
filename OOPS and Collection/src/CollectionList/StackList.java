package CollectionList;

import java.util.Stack;

public class StackList {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(12);
	s.push(34);
	s.push(46);
	s.push(89);
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.peek());
	System.out.println(s);
	System.out.println(s.search(34));
	System.out.println(s.search(65));
	System.out.println(s.set(2, 85));
	System.out.println(s);
}
}
