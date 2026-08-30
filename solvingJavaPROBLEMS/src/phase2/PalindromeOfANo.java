package phase2;
import java.util.Scanner;
public class PalindromeOfANo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(temp>0) {
			int dig=temp%10;
			rev=rev*10+dig;
			temp/=10;
			
		}
		if(n==rev) {
			System.out.println(n+" is palindrome");
		}
		else {
			System.out.println(n+" is not palindrome");
		}
sc.close();
	}
	

}
