package maps;

import java.util.HashMap;

public class DuplicateCharactersInStringUsingHashMap {
	public static void main(String[] args) {
		String s1 = "eeeytt";
		HashMap<Character, Integer> mp = new HashMap<>();
		char[] chArray = s1.toCharArray();
		for (Character ch : chArray) {
			if (mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch) + 1);
			} else
				mp.put(ch, 1);
		}
		System.out.println(mp);
	}
}
