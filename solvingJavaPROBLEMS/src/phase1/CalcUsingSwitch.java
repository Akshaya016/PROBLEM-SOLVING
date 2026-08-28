package phase1;
import java.util .*;
public class CalcUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        double a = sc.nextDouble();

		        System.out.print("Enter second number: ");
		        double b = sc.nextDouble();

		        System.out.print("Enter operator (+, -, *, /, %): ");
		        char op = sc.next().charAt(0);

		        switch (op) {

		            case '+':
		                System.out.println("Result: " + (a + b));
		                break;

		            case '-':
		                System.out.println("Result: " + (a - b));
		                break;

		            case '*':
		                System.out.println("Result: " + (a * b));
		                break;

		            case '/':
		                if (b != 0) {
		                    System.out.println("Result: " + (a / b));
		                } else {
		                    System.out.println("Cannot divide by zero.");
		                }
		                break;

		            case '%':
		                System.out.println("Result: " + (a % b));
		                break;

		            default:
		                System.out.println("Invalid operator.");
		        }

		        sc.close();
		    }
		

	

}
