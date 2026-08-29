package phase2;

import java.util.Scanner;

public class CountDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		n=Math.abs(n);
		int count=0;;
		while(n>0) {
			n/=10;
			count++;
		}
		System.out.println("the num of digits are:"+count);
sc.close();
	}

}
