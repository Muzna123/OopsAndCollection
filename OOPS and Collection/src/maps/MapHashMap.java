package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashMap {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(101, "Suresh");
		m.put(105, "null");
		m.put(114, "null");
		m.put(111, "Suresh");
		System.out.println(m);
		System.out.println("Size:" + m.size());
		System.out.println(m.get(111));
		Set ks = m.keySet();
		System.out.println("All keys present in map are:");
		Iterator it = ks.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("All values present in map are:");
		Collection val = m.values();
		Iterator it1 = val.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		Set entrySet = m.entrySet();
		Iterator it2 = entrySet.iterator();
		System.out.println("All key value pairs are");
		while (it2.hasNext())
			System.out.println(it2.next());
		System.out.println("All key value pairs of each Entry are:");
		Iterator it3 = entrySet.iterator();
		while (it3.hasNext()) {
			Map.Entry me = (Map.Entry) it3.next();
			System.out.println(me.getKey() + "------" + me.getValue());
			if (me.getKey().equals(114)) {
				me.setValue("Rani");
				System.out.println(me);
			}
		}
	}

}
