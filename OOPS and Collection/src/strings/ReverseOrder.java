package strings;

public class ReverseOrder {
public static void main(String[] args) {
	String s="yad doog a evaH";
	char[] c=s.toCharArray();
	for(int i=c.length-1;i>=0;i--)
		System.out.print(c[i]);
}
}
