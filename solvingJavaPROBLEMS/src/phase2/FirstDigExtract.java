package phase2;
import java.util.Scanner;
public class FirstDigExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		while(num>=10) {
			num=num/10;
		}
		System.out.println("the firstDigit is: "+num);
		

	}

}
