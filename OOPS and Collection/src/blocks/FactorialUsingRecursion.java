package blocks;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		int num=6;
		long Factorial=multiplyNumbers(num);
		System.out.println("Factorial of"+num+"="+Factorial);
	}
	public static long multiplyNumbers(int num) {
		if(num>=1)
			return num*multiplyNumbers(num-1);
		else
			return 1;  
	}

}
