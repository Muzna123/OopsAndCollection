package wrapperClass;

public class ByteWC {
	public static void main(String[] args) {
		byte x=10;
		Byte b=new Byte((byte)x);
		System.out.println(b);
		Byte b1=new Byte((byte)10);
		System.out.println(b1);
		short x1=20;
		Short s1=new Short(x1);
		System.out.println(s1);
		Short s=new Short("100");
		System.out.println(s);
		Byte b2=120;
		Short s3=new Short(b2);
		System.out.println(s3);
		Integer i=new Integer(30);
		System.out.println(i);
		byte b3=12;
		Integer i2=new Integer(b3);
		System.out.println(i2);
		long l=123;
		Integer i3=new Integer((int)l);
		System.out.println(i3);
		Integer i4=new Integer((int)10.20);
		System.out.println(i4);
		//Integer i5=new Integer((int)"10.20");//non primitive String object cannot be converted to primitive int type by compiler like autoboxing 
		//and autounboxing
		//System.out.println(i5);
		Integer i6=new Integer("123");
		System.out.println(i6);
		Long l1=new Long(15);
		System.out.println(l1);
		Long l2=new Long("125");
		System.out.println(l2);
		Long l3=new Long((long)25.5);
		System.out.println(l3);
		long l4=12345678789l;
		Long l5=new Long(l4);
		System.out.println(l4);
		Long l6=new Long("12345678789789");
	    System.out.println(l6);
		Float f=new Float(100.0);
		System.out.println(f);
		Float f1=new Float(100.0f);
		System.out.println(f1);
		Float f2=new Float("10.2f");
		System.out.println(f2);
		Float f3=new Float("10.3");
		System.out.println(f3);
		Double d=new Double(10.2);
		System.out.println(d);
		Double d1=new Double(102);
		System.out.println(d1);
		Double d2=new Double(100.0f);
		System.out.println(d2);
		Double d3=new Double("126");
		System.out.println(d3);
		Double d4=new Double("10.25f");
		System.out.println(d4);
		Character c1=new Character('A');
		System.out.println(c1);
		Character c2=new Character((char)66);
		System.out.println(c2);
		Character c3=new Character('6');
		System.out.println(c3);
		
		
		
		
		
		
		
		
		
	}

}
