package arrays;

public class JaggedArray3 {
public static void main(String[] args) {
	int[][] arr=new int[3][];
	int[] x1= {10,20,30};
	int[] x2= {20,40,60,80,100,56,78,98};
	int[] x3= {15,25,40};
	
	arr[0]=x1;
	arr[1]=x2;
	arr[2]=x3;
	System.out.println(arr[0][1]);
	
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
