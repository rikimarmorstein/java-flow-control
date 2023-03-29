package homework;

import java.util.zip.ZipEntry;

public class Lab8tar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = (int) (Math.random() * 101);
			arr[i] = j;
			if (z < arr[i]) {
				z = arr[i];

			}
			System.out.println(arr[i]);

		}
		System.out.println("====");
		System.out.println(z);

	}
}
