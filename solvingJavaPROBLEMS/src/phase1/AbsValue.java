package phase1;

import java.util.Scanner;

public class AbsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = Math.abs(num);

        System.out.println("Absolute value: " + result);

        sc.close();
       /*anathor method
        //if(num<0){
        //num=-num;
//}*/

	}

}
