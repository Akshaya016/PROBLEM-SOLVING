package phase1;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();//70

        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade: A");
        }
        else if (mark >= 80) {
            System.out.println("Grade: B");
        }
        else if (mark >= 70) {
            System.out.println("Grade: C");
        }
        else if (mark >= 60) {
            System.out.println("Grade: D");
        }
        else if (mark >= 0) {
            System.out.println("Grade: F");
        }
        else {
            System.out.println("Invalid mark");
        }

        sc.close();


	}

}
