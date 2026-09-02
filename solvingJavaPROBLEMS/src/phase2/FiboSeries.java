package phase2;

import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N:");
		int N=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=N;i++) {
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
	
		}
sc.close();

	}

}
