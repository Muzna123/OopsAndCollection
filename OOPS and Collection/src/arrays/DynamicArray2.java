package arrays;
//Jagged Array
public class DynamicArray2 {
	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		int[] x1= {10,20,30};
		int[] x2= {30,40};
		int[] x3= {15,20,45};
		arr[0]=x1;
		arr[2]=x2;
		arr[1]=x3;
		for(int[]i:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
