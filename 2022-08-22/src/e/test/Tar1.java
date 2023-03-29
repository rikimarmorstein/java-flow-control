package e.test;

import java.util.Arrays;

public class Tar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("answer 1 + 2");
		int[] nums1 = new int[25];
		int[] nums2 = new int[25];

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 10);

			// System.out.print(nums1[i] + " ");
		}
		// System.out.println();
		System.out.println(Arrays.toString(nums1));

		for (int j = 0; j < nums2.length; j++) {
			nums2[j] = (int) (Math.random() * 10);

			// System.out.print(nums2[j] + " ");
		}
		// System.out.println();
		System.out.println(Arrays.toString(nums2));
		System.out.println("answer 3");

		int sumk = 0;
		int bk = 0;

		for (int i = 0; i < nums1.length; i++) {
			int sum = 1;
			int b = 0;

			for (int a = i + 1; a < nums1.length; a++) {
				if (nums1[i] == nums1[a] && nums1[i] != 0) {
					b = nums1[a];
					sum++;
				}
			}

			if (sum > sumk) {
				sumk = sum;
				bk = b;
			} else if (sum == sumk && b > bk) {
				sumk = sum;
				bk = b;
			}
		}
		int p = 0;
		while (p < sumk) {
			System.out.print(bk);
			p++;
		}
		System.out.println();

		int sumk2 = 0;
		int bk2 = 0;

		for (int i = 0; i < nums2.length; i++) {
			int sum2 = 1;
			int b2 = 0;

			for (int a = i + 1; a < nums2.length; a++) {
				if (nums2[i] == nums1[a] && nums2[i] != 0) {
					b2 = nums2[a];
					sum2++;
				}
			}

			if (sum2 > sumk2) {
				sumk2 = sum2;
				bk2 = b2;
			} else if (sum2 == sumk2 && b2 > bk2) {
				sumk2 = sum2;
				bk2 = b2;
			}
		}
		int p2 = 0;
		while (p2 < sumk2) {
			System.out.print(bk2);
			p2++;
		}
		System.out.println();

		System.out.println("answer 5");

		int[] max = new int[5];
		int y = 9;
		for (int i = 0; i < max.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[j] == y || nums2[j] == y) {
					max[i] = y;
				}

			}
			y = y - 1;
		}
		System.out.println(Arrays.toString(max));

		System.out.println("answer 6");

		int[] arr4 = new int[nums2.length * 2 + 5];
		System.arraycopy(nums1, 0, arr4, 0, 25);
		System.arraycopy(nums2, 0, arr4, 25, 25);
		System.arraycopy(max, 0, arr4, 30, 5);
		System.out.println(Arrays.toString(arr4));

		
		for (int i = arr4.length-1; i>0; i--) {
			for (int j = 0; j <i; j++) {
				int a = arr4[j];
				int b = arr4[j+1];
				if (a>b) {
					 arr4[j+1]=a;
					arr4[j]=b;
				}
			}
		}
		System.out.print(Arrays.toString(arr4));
		System.out.println();
		for (int i = arr4.length-3; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
System.out.println();
		System.out.println("answer 7");

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 1 + i; j < nums1.length; j++) {
				if (nums1[i] == nums1[j]) {
					nums1[j] = -1;
				}
			}
			if (nums1[i] > -1 && nums1[i] % 2 == 0)
				System.out.print(nums1[i] + " ");

		}
		System.out.println();

		System.out.println("answer 8");

		for (int i = 0; i < nums2.length; i++) {
			for (int j = 1 + i; j < nums2.length; j++) {
				if (nums2[i] == nums2[j]) {
					nums2[j] = -1;
				}
			}
			if (nums2[i] > -1 && nums2[i] % 2 != 0)
				System.out.print(nums2[i] + " ");

		}
		System.out.println();

	}
}
