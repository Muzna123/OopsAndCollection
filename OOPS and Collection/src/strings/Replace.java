package strings;

public class Replace {
	public static void main(String[] args) {
		String str="JavaDeveloper";
		System.out.println(str=str.replace('a', 'e'));
		System.out.println(str);
		System.out.println(str=str.replace('e', 'a'));
		System.out.println(str=str.replace("va", "ve"));
		System.out.println(str=str.replaceAll("ve", "va"));
		System.out.println(str=str.replaceFirst("va", "ve"));
		
		String str1="  java is beautifull language  ";
		//System.out.println(str1.strip());
		//System.out.println(str1.split(" "));
		System.out.println(str1.trim().replaceAll(" ", ""));
		
		
		

		
		
		
		
	}

}
