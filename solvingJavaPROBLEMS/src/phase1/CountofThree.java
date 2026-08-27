package phase1;

import java.util.Scanner;

public class CountofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int value = Math.abs(num);

        if (value >= 100 && value <= 999) {
            System.out.println(num + " is a three-digit number.");
        } 
        else {
            System.out.println(num + " is not a three-digit number.");
        }

        sc.close();
/*
 * count=0;
 * while(n>0){
 * n/=10;
 * count++;
 * if(count==3)
 * check if it is 0 then it print count as 0 instead of one so use 
 * temp var to store the num and if temp==0 then count=1;
 */

	}

}
