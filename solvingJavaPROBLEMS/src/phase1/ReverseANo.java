package phase1;

import java.util.Scanner;

public class ReverseANo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int rev = 0;

	        while (n > 0) {
	            int dig = n % 10;
	            rev = rev * 10 + dig;
	            n /= 10;
	        }

	        System.out.println("Reversed number: " + rev);

	        sc.close();

	}

}
