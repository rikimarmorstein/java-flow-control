package homework;

import java.util.function.BiConsumer;

public class Lab8tar8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		int sum = 0;
		int z = 0;
		int l = 0;
		int s = 100;
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = (int) (Math.random() * 101);
			arr[i] = a;
			sum += a;
			if (z < arr[i]) {
				z = arr[i];
				l = i;

			} else if (arr[i] < s) {
				s = arr[i];
				m = i;

			}
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("====");
		System.out.println("sum: " + sum);
		System.out.println(sum / arr.length);
		System.out.println(z + " in index: " + l);
	//	System.out.println(l);
		System.out.println(s + " in index: " + m);
	//	System.out.println(m);

	}

}
