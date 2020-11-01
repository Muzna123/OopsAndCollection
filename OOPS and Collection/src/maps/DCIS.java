package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class DCIS {
	@Test
	public void dCIS() {
		String str="Today is a good day";
		char[] c = str.toCharArray();
		int count=1;
		HashMap<Character, Integer> lm=new HashMap<>();
		for(int i=0;i<c.length;i++) {
			if(lm.get(c[i])>0)
			count++;
			else
				lm.put(c[i],count);
			 
		}
		Set<Character> s = lm.keySet();
		Iterator<Character> it = s.iterator();
		if(it.hasNext()) {
			char c1=it.next();
			if(lm.get(c1)>1)
				System.out.println("Number of occurance"+ c1+ lm.get(c1));
		}
	}

}
