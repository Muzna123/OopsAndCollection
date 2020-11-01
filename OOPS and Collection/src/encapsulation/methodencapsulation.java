package encapsulation;

public class methodencapsulation {

	private int m1() {
		System.out.println("m1 running");
		return 10;
	}

	public int getm1() {

		 return m1();
	}
	/*
	 * public void get1m1() {
	 *  int x=m1();
	 *  System.out.println(x);
	 *   } 
	 * public int get2m1() {
	 *  return m1();
	 *   } 
	 */
}