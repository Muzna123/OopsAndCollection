package strings;

public class RohitoshOccuranceInString {
	public static void main(String[] args) {
		String s = "Rohitosh is a good boy and He study very hard . Rohitosh loves india and He likes to play cricket . He is the only masterpiece in class";
		int r = 0;
		int is = 0;
		int and = 0;
		int He = 0;

		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equals("Rohitosh"))
				r++;
			else if (s1[i].equals("is"))
				is++;
			else if (s1[i].equals("and"))
				and++;
			else if (s1[i].equals("He"))
				He++;
			else {
				
			}
		}

		System.out.println(r);
		System.out.println(is);
		System.out.println(and);
		System.out.println(He);
	}
}
