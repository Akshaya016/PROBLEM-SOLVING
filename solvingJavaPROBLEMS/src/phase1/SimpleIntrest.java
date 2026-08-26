package phase1;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);

        sc.close();
    }


}
