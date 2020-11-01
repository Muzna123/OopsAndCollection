package strings;

import java.util.Random;

import org.testng.annotations.Test;

public class CheckingSubString {
	@Test
 public void checkingSubString() {
	 String str="TestUser1234";
	 System.out.println(str.substring(8,str.length()));
	 
	// String str1="USER";
	 Random r=new Random();
	 int nextInt = r.nextInt(999);
	 System.out.println(nextInt);
	 String user="USER"+nextInt;
	 System.out.println(user);
 }
}
