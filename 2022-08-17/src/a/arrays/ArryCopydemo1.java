package a.arrays;

import java.util.Arrays;

public class ArryCopydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 4, 6, 8 };
		int[] arr2 = new int[arr1.length + 4];

		System.arraycopy(arr1, 0, arr2, 4, 4);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
