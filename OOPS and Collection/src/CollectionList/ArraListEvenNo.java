package CollectionList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArraListEvenNo {
	

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		 ListIterator listIterator = l.listIterator();
		    while(listIterator.hasNext())
		    {
		    	Integer i=(Integer)listIterator.next();
		    	if(i%2==0)
		    		System.out.println(i);
		    	else
		    		listIterator.remove();
		    }
		    System.out.println(l);
		    System.out.println("-------------------");
		    while(listIterator.hasPrevious())
		    	System.out.println(listIterator.previous());
	}
	

}
