package phase2;

import java.util.Scanner;

public class GCDofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no 1:");
		int a=sc.nextInt();
		System.out.println("enter no 2:");
		int b=sc.nextInt();
		int Small=Math.min(a, b);
		int gcd=1;
		for(int i=1;i<=Small;i++) {
			if(a%i==0 &&b%i==0) {
				gcd=i;
				
			}
	
			
		}
		
	System.out.println("GCD:"+gcd);
	sc.close();
	}
	}


