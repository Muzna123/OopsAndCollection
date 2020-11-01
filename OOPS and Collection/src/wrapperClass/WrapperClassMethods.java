package wrapperClass;

public class WrapperClassMethods {
	public static void main(String[] args) {
		Integer i=Integer.valueOf("123");
		System.out.println(i);
		String s1="100";
		String s2="100";
		int i1=Integer.parseInt(s1);
		float f=Float.parseFloat(s2);
		System.out.println(i1+f);
		System.out.println(f);
		Integer i2=100;
		long l=i2;
		m1((long)10);
		Object o1=10;
		Object o2=20;
		//System.out.println(o1+o2);
		Boolean b1=true;
		Boolean b2=true;
		System.out.println(b1==b2);
		Byte by1=127;
		Byte by2=127;
		System.out.println(by1==by2);
		Integer i3=new Integer(10);
		Integer j=new Integer(100);
		System.out.println(i3==j);
		System.out.println(i3.equals(j));
		Integer i5=1003;
		Integer i6=1003;
		System.out.println(i5==i6);
		System.out.println(i5.equals(i6));
	}
	static void m1(Long x)
	{
		System.out.println("Long running");
	}
}
