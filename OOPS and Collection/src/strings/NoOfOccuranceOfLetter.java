package strings;

public class NoOfOccuranceOfLetter {
	public static void main(String[] args) {
		String str = "Himalaya";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j] && i>j)
					break;
				if(ch[i]==ch[j])
					count++;
				if(j==ch.length-1)
					System.out.println(ch[i]+"has occured "+count+"times");
			}
		}

	}
}
