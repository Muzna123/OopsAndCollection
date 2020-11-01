package strings;

public class IsUpperCase {
	public static void main(String[] args) {
		String str = "AB12ahg%g1M^";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A' || ch[i] == 'B' || ch[i] == 'M')
				System.out.print(ch[i]);
		}
		System.out.println();

		String str1 = "AB12ah%g1M^";
		char[] ch1 = str1.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == 'a' || ch1[i] == 'h')
				System.out.print(ch1[i]);
		}
		System.out.println();

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == '1' || ch1[i] == '2')
				System.out.print(ch1[i]);
		}

		System.out.println();

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == '%' || ch1[i] == '^')
				System.out.print(ch1[i]);
		}
	}

}
