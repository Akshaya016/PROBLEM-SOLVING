package phase1;

import java.util.Scanner;

public class STuDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter your name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter your age: ");
		        int age = sc.nextInt();
		        sc.nextLine(); // consume leftover newline

		        System.out.print("Enter your college: ");
		        String college = sc.nextLine();

		        System.out.print("Enter your department: ");
		        String department = sc.nextLine();

		        System.out.println("\n----- Student Details -----");
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("College: " + college);
		        System.out.println("Department: " + department);

		        sc.close();
		    }
		

	

}
