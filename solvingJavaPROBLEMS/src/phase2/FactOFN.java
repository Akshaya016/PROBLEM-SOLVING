package phase2;

import java.util.Scanner;

public class FactOFN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N:");
		int N=sc.nextInt();
		int fact=1;
		for(int i=1;i<=N;i++) {
			fact=fact*i;
		}
		System.out.println("the fact is:"+fact);
sc.close();
	}

}
