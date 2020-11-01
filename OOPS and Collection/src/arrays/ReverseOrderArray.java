package arrays;

public class ReverseOrderArray {
	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40, 50 };
		int[] y = new int[x.length];
		/*for (int i = x.length - 1; i >= 0; i--)
			System.out.print(x[i] + " ");*/
		int j=0;
		for (int i = x.length - 1; i >= 0; i--) {
			  	y[j] = x[i];
				j++;
			
		}
		for(int k:y)
			System.out.print(k+" ");
	}

}
