package blocks;

public class Blocks1 {
	static {
		System.out.println("Static block of MainClass");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		new Sample1();
		System.out.println("i value is"+Sample1.i);
		System.out.println("i value is"+Sample1.i);
		
	}
}

class Sample1 {
	static int i=200;
	static
	{
		i=100;
		System.out.println("Static block in Sample1");
	}

	Sample1() {
		i=300;
		System.out.println("Sample1 constructor");
	}
}
