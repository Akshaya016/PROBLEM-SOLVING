package phase2;
import java.util.Scanner;
public class EvenCountOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int Evenc=0;
		int Oddc=0;
		while(n>0) {
			int dig=n%10;
			if(dig%2==0) {
				Evenc++;
			}
			else {
				Oddc++;
			}
		n/=10;
		}
System.out.println("the even count is:"+Evenc);
System.out.println("the odd count is:"+Oddc);
	}

}
