package phaseDSA;

public class ArraysEX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num= {12,34,67,78,89,65};
		int small=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]<small) {
				small=num[i];
			}
		}
System.out.println("the small num is:"+small);
	}

}
