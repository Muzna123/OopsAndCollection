package maps;

import java.util.HashMap;
import java.util.WeakHashMap;

public class MapWeakHashMap {
	public static void main(String[] args) throws InterruptedException {
		//HashMap m=new HashMap();
		WeakHashMap m=new WeakHashMap();
		Student s=new Student(101);
		m.put(s, "Hello");
		System.out.println(m);
		s=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		
	}

}
class Student{
	int rollnum;
	public Student(int rollnum) {
		this.rollnum=rollnum;
	}
	@Override
	public String toString() {
		return rollnum + "";
	}
	protected void finalize() {
		System.out.println("Object Dependency removed");
	}
	
}