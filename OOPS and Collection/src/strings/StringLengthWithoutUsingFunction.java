package strings;

public class StringLengthWithoutUsingFunction {
	public static void main(String[] args) {
		int count=0;
		String str="Have a good day";
		String []s=str.split("");
		for(String j:s) {
			System.out.print(j);
			count++;
		}
		System.out.println();
	 System.out.println("Lenth of string is :"+ count);
	 System.out.println(str.length());
	}
	
}
