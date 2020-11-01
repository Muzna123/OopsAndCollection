package arrays;

import java.util.Scanner;

public class Dynamic2Darray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int row=scan.nextInt();
		System.out.println("Enter the no. of columns");
		int col=scan.nextInt();
		int[][]x=new int[row][col];
		System.out.println("Enter elements of array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				x[i][j]=scan.nextInt();
		
			}
		}
		System.out.println("2D array is");
		for(int []i:x)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
