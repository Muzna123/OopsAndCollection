package strings;

public class NoDuplicateWords {
	public static void main(String[] args) {

		String s = "Nirma washing powder Nirma powder is very good for washing Nirma cloths";
		String[] s1 = s.split(" ");
		String s2 = "";

		for (int i = 0; i < s1.length; i++) {
			int count = 0;

			for (int j = 0; j < s1.length; j++) {
				if (s1[i].equals(s1[j]) && i > j)
					break;
				if (s1[i].equals(s1[j]))
					count++;

				if (j == s1.length - 1 && count == 1)
					s2 = s2 + s1[i] + " ";

			}
		}
		System.out.println(s2);

	}
}