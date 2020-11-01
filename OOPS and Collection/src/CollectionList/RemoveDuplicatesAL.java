package CollectionList;

import java.util.ArrayList;

public class RemoveDuplicatesAL {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(45);
		l.add(85);
		l.add(85);
		l.add(10);
		l.add(9);
		l.add(1);
		System.out.println(l);
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i).equals(l.get(j)))
					l.remove(j);
			}
		}
		System.out.println(l);

	}
}
