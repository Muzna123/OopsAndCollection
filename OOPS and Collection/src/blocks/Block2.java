package blocks;

public class Block2 {
	static int x=10;
	public static void m1() {
		System.out.println("m1 running");
	}
	static
	{
		System.out.println("SBR");
	}
	public static void main(String[] args) {
		System.out.println(x);
		m1();
	}

}
