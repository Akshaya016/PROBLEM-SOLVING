package phase2;

import java.util.Scanner;

public class LCMmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using formulae lcm=(a*b)/hcf
		
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
		int lcm=(a*b)/gcd;
		System.out.println("LCM:"+lcm);
	sc.close();
	}

}
