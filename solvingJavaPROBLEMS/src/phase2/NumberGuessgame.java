package phase2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        Random rand = new Random();

		        int secret = rand.nextInt(1,11);
		        int guess;

		        do {
		            System.out.print("Enter your guess (1-10): ");
		            guess = sc.nextInt();

		            if (guess < secret) {
		                System.out.println("Too low! Try again.");
		            } 
		            else if (guess > secret) {
		                System.out.println("Too high! Try again.");
		            } 
		            else {
		                System.out.println("Correct! 🎉");
		            }

		        } while (guess != secret);

		        sc.close();
		    }
		}

	
