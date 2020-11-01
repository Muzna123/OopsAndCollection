package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInListUsingHashMap {
	public static void main(String[] args) {
		ArrayList<Character> l=new ArrayList<>();
		l.add('a');
		l.add('b');
		l.add('a');
		l.add('c');
		l.add('c');
		l.add('e');
		l.add('f');
		l.add('f');
		l.add('c');
		HashMap<Character, Integer> mp=new HashMap<>();
		for(Character ch:l)
		{
			if(mp.containsKey(ch))
				mp.put(ch, mp.get(ch)+1);
			else
				mp.put(ch, 1);
		}
		Set<Character> set = mp.keySet();
		System.out.println("Duplicate characters present in list are:");
		for(Character ch1:set)
		{
			if(mp.get(ch1)>1)
				System.out.println(ch1+"="+mp.get(ch1));
		}
			
		
	}

}
