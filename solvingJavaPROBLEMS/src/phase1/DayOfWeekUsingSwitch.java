package phase1;
import java.util.Scanner;
public class DayOfWeekUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number(1-7):");
int ch=sc.nextInt();
switch(ch) {
case 1:System.out.println("Monday");
break;
case 2:System.out.println("Tuesday");
break;
case 3:System.out.println("Wednesday");
break;
case 4:System.out.println("Thursday");
break;
case 5:System.out.println("Friday");
break;
case 6:System.out.println("Saturday");
break;
case 7:System.out.println("Sunday");
break;
default:System.out.println("enter no between 1 to 7");
}












	}

}
