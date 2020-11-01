package CollectionList;

import java.util.Enumeration;
import java.util.Vector;

public class Vlist1 {
public static void main(String[] args) {
	Vector v=new Vector();
	for(int i=1;i<=10;i++)
		v.add(i);
	Enumeration e=v.elements();
	while (e.hasMoreElements()) {
		Integer i = (Integer)e.nextElement();
		if(i%2==1)
			System.out.println(i);
		
	}
	
}
}
