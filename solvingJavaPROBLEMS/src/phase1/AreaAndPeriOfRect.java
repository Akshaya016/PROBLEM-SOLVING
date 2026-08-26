package phase1;

import java.util.Scanner;

public class AreaAndPeriOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter length: ");
	        double length = sc.nextDouble();

	        System.out.print("Enter breadth: ");
	        double breadth = sc.nextDouble();

	        double area = length * breadth;
	        double perimeter = 2 * (length + breadth);

	        System.out.println("Area: " + area);
	        System.out.println("Perimeter: " + perimeter);

	        sc.close();
	}

}
