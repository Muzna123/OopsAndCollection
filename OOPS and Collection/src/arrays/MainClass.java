package arrays;

public class MainClass {

	public static void main(String[] args) {
		StudentDetails[] arr = new StudentDetails[3];
		arr[0] = new StudentDetails(2, "mukesh", 5.2);
		arr[1] = new StudentDetails(2, "ba", 6.0);
		arr[2] = new StudentDetails(5, "Anish", 4.2);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        	System.out.println(arr[i].id);
        	System.out.println(arr[i].name);
        	System.out.println(arr[i].marks);
        }
	}
}
