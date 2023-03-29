package a;

import java.util.Arrays;

public class Lab10Tar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length = 7;
		int []arr1 = new int[length];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*11);
			}System.out.println(Arrays.toString(arr1));
			
			int []arr2 = new int[arr1.length];
for (int i = 0, j=arr1.length-1; i < arr1.length; i++, j--) {
	arr2[j] = arr1[i];
	
}System.out.println(Arrays.toString(arr2));
	}

}
