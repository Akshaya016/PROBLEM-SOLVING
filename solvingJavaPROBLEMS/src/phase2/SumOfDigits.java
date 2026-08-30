package phase2;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int dig=n%10;
			sum+=dig;
		n/=10;
		}
System.out.println("the sum of num is:"+sum);
sc.close();

	}

}
