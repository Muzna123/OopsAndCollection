package arrays;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Object[] arr = new Object[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter name,id,marks");
			int id = scan.nextInt();
			String name = scan.nextLine();
			double marks = scan.nextDouble();
			scan.nextLine();
			arr[i] = new StudentDetails(id, name, marks);
		}
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        	StudentDetails s=(StudentDetails)arr[i];
        	System.out.println(s.id);
        	System.out.println(s.name);
        	System.out.println(s.marks);
        	
        }
	}

}
