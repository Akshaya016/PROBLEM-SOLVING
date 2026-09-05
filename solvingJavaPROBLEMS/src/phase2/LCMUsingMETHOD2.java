package phase2;

import java.util.Scanner;

public class LCMUsingMETHOD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no 1:");
		int a=sc.nextInt();
		System.out.println("enter no 2:");
		int b=sc.nextInt();
		int max=Math.max(a, b);
		int lcm=max;
		for(int i=max; ;i++) {
			if(i%a==0 &&i%b==0) {
				lcm=i;
				break;
			}
	
			
		}
		
	System.out.println("LCM:"+lcm);
	sc.close();

	}

}
