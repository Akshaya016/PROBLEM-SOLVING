package phase1;
import java.util .*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
      System.out.println("enter a no to generate table");
      int n=sc.nextInt();
      for(int i=1;i<=10;i++) {
    	  System.out.println(n+"x"+i+"="+(n*i));
      }
	}

}
