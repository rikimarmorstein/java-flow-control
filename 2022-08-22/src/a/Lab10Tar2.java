package a;

import java.util.Arrays;

public class Lab10Tar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 12, 5, 5, -1, -1, 0, 8, 8 };
		int[] arr2 = getUniqueArr(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	public static int[] getUniqueArr(int[] arr) {
		int[] temp = new int[arr.length];
		int length = 0;

		for (int i = 0; i < arr.length; i++) {
			int copy = arr[i];
			boolean riki = true;

			for (int j = 0; j < length; j++) {
				if (copy == temp[j]) {
					riki = false;
					break;
				}
			}
			if (riki) {
				temp[length++] = copy;

			}

		}
		arr = new int[length];
		System.arraycopy(temp, 0, arr, 0, length);
		return arr;
	}
}
