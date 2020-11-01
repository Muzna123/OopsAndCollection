package set;

import java.util.TreeSet;

public class NonComparableHeterogeneousComparable {
	public static void main(String[] args) {
		Employee e1=new Employee("Raju", 5);
		Employee e2=new Employee("Nap", 8);
		Employee e3=new Employee("Lare", 4);
		Employee e4=new Employee("Murw", 1);
		Employee e5=new Employee("Gity", 6);
		Employee e6=new Employee("Hare", 78);
		Employee e7=new Employee("Adw", 15);
		TreeSet set=new TreeSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		System.out.println(set);
	}

}
class Employee implements Comparable{
	String name;
	int eid;
	public Employee(String name,int eid) {
		this.eid=eid;
		this.name=name;
	}

	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
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
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}
}