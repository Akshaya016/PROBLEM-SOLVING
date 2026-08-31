package phase2;

import java.util.Scanner;

public class PrimeFrom1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub10

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter N: ");
		        int n = sc.nextInt();

		        System.out.println("Prime numbers:");

		        for (int num = 2; num <= n; num++) {

		            int count = 0;

		            for (int i = 1; i <= num; i++) {

		                if (num % i == 0) {
		                    count++;
		                }
		            }

		            if (count == 2) {
		                System.out.print(num + " ");
		            }
		        }

		        sc.close();
		    }
		}

	

