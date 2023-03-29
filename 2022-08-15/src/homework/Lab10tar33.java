package homework;

import java.util.Arrays;

public class Lab10tar33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		int[] arr1 = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 11);
			arr[i] = r;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr1.length; i++) {
			System.arraycopy(arr, 0+i, arr1, arr1.length-1-i, 1);

		}
		

		System.out.println(Arrays.toString(arr1));

	}
}
