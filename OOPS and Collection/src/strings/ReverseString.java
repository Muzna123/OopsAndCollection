package strings;

public class ReverseString {
	public static void main(String[] args) {
		String s="Have a good day";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
			System.out.print(c[i]);
	}

}
