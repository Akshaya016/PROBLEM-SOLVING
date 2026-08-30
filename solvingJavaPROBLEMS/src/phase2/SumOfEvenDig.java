package phase2;
import java.util.*;
public class SumOfEvenDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number:");
		int n=sc.nextInt();
		while(n>0) {
			int dig=n%10;
			if(dig%2==0) {
				sum+=dig;
			}
			n/=10;
		}
		System.out.println("the sum of even dig is:"+sum);
		sc.close();

	}

}
