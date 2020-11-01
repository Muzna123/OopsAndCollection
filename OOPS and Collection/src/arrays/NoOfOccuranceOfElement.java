package arrays;

public class NoOfOccuranceOfElement {
	public static void main(String[] args) {
		int[]x= {12,24,15,15,12,30,24,12};
		for (int i = 0; i < x.length; i++) {
			int count=0;
			for (int j = 0; j < x.length; j++) {
				if(x[i]==x[j] && i>j)
					break;
				if(x[i]==x[j])
					count++;
				if(j==x.length-1)
					System.out.println(x[i]+"has occured "+count+"times");
			}
		}
			
	}

}
