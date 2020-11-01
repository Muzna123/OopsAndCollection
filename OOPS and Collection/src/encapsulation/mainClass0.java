package encapsulation;

public class mainClass0 {

		public static void main(String[] args) {
			
			Singleton s1=Singleton.getSingleton();
			System.out.println(s1);
			Singleton s2=Singleton.getSingleton();
			System.out.println(s2);
			Singleton s3=Singleton.getSingleton();
			System.out.println(s3);
			
		}
	}

