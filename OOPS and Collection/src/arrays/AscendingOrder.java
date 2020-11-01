package arrays;
//Bubble Sort
public class AscendingOrder {
	public static void main(String[] args) {
		int[] a = { 20, 4, 6, 84, 57, 62 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("Ascending Array:");
		for(int k:a)
			System.out.print(k+" ");

	}
}
