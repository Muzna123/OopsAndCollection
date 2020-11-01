package strings;

public class EvenOdd {
	public static void main(String[] args) {
		int[]x= {10,13,71,75,52,26,18};
		String even="";
		String odd="";
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
				even=even+x[i]+" ";
			else
				odd=odd+x[i]+" ";
				
		}
		System.out.println("Even numbers are "+even);
		System.out.println("Odd numbers are "+odd);
	}

}
