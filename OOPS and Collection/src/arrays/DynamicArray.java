package arrays;

import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Ënter size of array");
		int size=scan.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		System.out.println("Elements of array are");
		for(int j:arr)
			System.out.println(j);
	}

}
