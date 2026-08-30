package phase2;

import java.util.Scanner;

public class ProductOfDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int product=1;
		while(n>0) {
			int dig=n%10;
			product*=dig;
		n/=10;
		}
System.out.println("the sum of num is:"+product);
sc.close();

	}

}
