package arrays;

public class ArrayLenghWithoutUsingFunc {
	public static void main(String[] args) {
		int [] arr= {10,20,45,15,24,85,75};
		int count=0;
		for(int j:arr)
			count++;
		System.out.println("Array length is:" +count);
		System.out.println("Array length is:" +arr.length);
	}
	

}
