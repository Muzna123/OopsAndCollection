package encapsulation;

public class Singleton {
	static Singleton singleton=null;
	static int count=1;
	private Singleton()
	{
		count++;
		
	}
	public static Singleton getSingleton() {
		if(count==1) {
		singleton=new Singleton();
		}
		
		return singleton;
		
	}

}
