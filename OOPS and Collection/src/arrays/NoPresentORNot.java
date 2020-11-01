package arrays;

public class NoPresentORNot {
	public static void main(String[] args) {
		int[] x = { 12, 23, 34, 48, 84, 75, 89 };
		int num = 89;
		boolean flag=false;
		int i;
		for (i = 0; i < x.length; i++) {
			if (num == x[i]) {
				flag = true;
				break;
			}
			

		}
		if(flag)
		System.out.println(num + "present at" + i+ "position");
		else
			System.out.println("No. not present");
	}
}
