package phaseDSA;

import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size:");
		int n=sc.nextInt();
		System.out.println("enter the numbers:");
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();			
		}
		int fL=arr[0];
		int sL=arr[0];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>fL) {
				sL=fL;
				fL=arr[j];
			}
			else if(arr[j]>sL && arr[j]!=fL) {
				sL=arr[j];
			}
		}
System.out.println("the first large:"+fL);
System.out.println("the second large:"+sL);
	}

}
