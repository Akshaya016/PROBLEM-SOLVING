package phaseDSA;

public class ArraysEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25, 10, 45, 32, 67, 18};

		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] > largest) {
		        largest = arr[i];
		    }
		}

		System.out.println(largest);
		
		

	}

}
