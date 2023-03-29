package homework;

import java.util.Arrays;

public class Lab10tar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 1, 6, 1, 5, 4, 8 };
		int y = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] == arr[j])
					arr[j] = -1;

			}

		}

		for (int i = 0; i < arr.length; i++)
			if (arr[i]>=0)
			System.out.print(arr[i]);
	}

}
