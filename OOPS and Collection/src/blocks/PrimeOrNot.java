package blocks;

public class PrimeOrNot {
	public static void main(String[] args) {
		int str = 20;
		int end = 30;
		int i;
		for ( i = str; i <= end; i++) {
			int count = 2;
          for(int j=2;j<=i/2;j++) {
        	  if(i%j==0) {
        		  count++;
        		  break;
        	  }
        	  
          }
          if(count==2 && i>=2)
        	  System.out.println(i+" is prime");
          else
        	  System.out.println(i+" not prime");
		}
		
	}

}
