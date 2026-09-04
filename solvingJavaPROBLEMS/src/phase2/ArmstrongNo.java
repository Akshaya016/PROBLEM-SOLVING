package phase2;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number: ");
		        int n = sc.nextInt();

		        int original = n;
		        int temp = n;
		        int count = 0;

		        // Count digits
		        while (temp > 0) {
		            count++;
		            temp /= 10;
		        }

		        temp = n;
		        int sum = 0;

		        // Calculate Armstrong sum
		        while (temp > 0) {
		            int digit = temp % 10;
		            sum += Math.pow(digit, count);
		            temp /= 10;
		        }

		        // Check
		        if (sum == original) {
		            System.out.println(n + " is an Armstrong number");
		        } else {
		            System.out.println(n + " is not an Armstrong number");
		        }

		        sc.close();
		    }
		
		
		
		
	

}
