package strings;

public class UpperCaseLowerCaseNumSpl {
	public static void main(String[] args) {
		String str = "AB12ahg%g1M^";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z')
				System.out.print(ch[i]);
		}
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				System.out.print(ch[i]);
		}
		System.out.println();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9')
				System.out.print(ch[i]);
		}
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {

			} else if (ch[i] >= 'a' && ch[i] <= 'z') {

			} else if (ch[i] >= '0' && ch[i] <= '9') {

			} else
				System.out.print(ch[i]);

		}

	}
}
