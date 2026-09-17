package phaseDSA;

public class ArraysEX05Secondlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {23,45,24,67,75};
		int fL=arr[0];
		int sL=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>fL) {
				sL=fL;
				fL=arr[i];
				
			}
			else if(arr[i]>sL && arr[i]!=fL) {
				sL=arr[i];
			}
		}
		System.out.println("first large:"+fL);
		System.out.println("the second large:"+sL);
	}

}
