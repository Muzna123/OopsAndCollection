package strings;

public class ReverseWordInString {
	public static void main(String[] args) {
		String s = "Have a good day";
		String[] s1 = s.split(" ");
		String rev = "";
		for (int i = 0; i < s1.length; i++) {
			for (int j = s1[i].length() - 1; j >= 0; j--) {

				rev = rev + s1[i].charAt(j);

			}
			rev=rev+" ";

		}

	System.out.println(rev);
	}
}
