package set;

import java.util.Comparator;
import java.util.TreeSet;

public class NonComparableHeterogeneousComparator {
	public static void main(String[] args) {
		Employee1 e1=new Employee1("Raju", 5);
		Employee1 e2=new Employee1("Nap", 8);
		Employee1 e3=new Employee1("Lare", 4);
		Employee1 e4=new Employee1("Murw", 1);
		Employee1 e5=new Employee1("Gity", 6);
		Employee1 e6=new Employee1("Hare", 78);
		Employee1 e7=new Employee1("Adw", 15);
		TreeSet set=new TreeSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		System.out.println(set);
		TreeSet set1=new TreeSet(new MyComparator2());
		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		set1.add(e4);
		set1.add(e5);
		set1.add(e6);
		set1.add(e7);
		System.out.println(set1);
	}
}
class Employee1 implements Comparable{
	String name;
	int eid;
	public Employee1(String name,int eid) {
		this.eid=eid;
		this.name=name;
	}

	@Override
	public int compareTo(Object o) {
		Employee1 e=(Employee1)o;
		int eid1=this.eid;
		int eid2=e.eid;
		if(eid1<eid2)
		return -1;
		if(eid1>eid2)
			return 1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", eid=" + eid + "]";
	}	
}
class MyComparator2 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
	Employee1 e1=(Employee1)o1;
	Employee1 e2=(Employee1)o2;
	String s1=e1.name;
	String s2=e2.name;
	return s1.compareTo(s2);
	}
}
