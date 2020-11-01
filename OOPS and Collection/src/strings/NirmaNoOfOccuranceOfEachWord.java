package strings;

public class NirmaNoOfOccuranceOfEachWord {
	public static void main(String[] args) {
		String s = "Nirma washing powder Nirma powder is very good for washing Nirma cloths";
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			int count = 0;

			for (int j = 0; j < s1.length; j++) {
				if (s1[i].equals(s1[j]) && i > j)
					break;
				if (s1[i].equals(s1[j]))
					count++;

				if (j == s1.length - 1) 
					System.out.println(s1[i] + "has occured " + count + "times");
				
			}
		}

	}

}
