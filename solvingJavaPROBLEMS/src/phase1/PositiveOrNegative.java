package phase1;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Positive");
		}
		else if(n<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
sc.close();
	}

}
