package e.test;

import java.util.Arrays;

public class A {

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

	//	for (int j = 0; j < nums2.length; j++) {
	//		nums2[j] = (int) (Math.random() * 10);


		int [] ezer = new int [10];
		for (int i = 0; i < nums1.length; i++) {
			if (ezer[nums1[i]] !=0  ) {
				ezer[nums1[i]]=ezer[nums1[i]]*10;
				ezer[nums1[i]]=ezer[nums1[i]] + nums1[i];
			}else {
				ezer[nums1[i]] = nums1[i];
			}
		}
		
		System.out.println(Arrays.toString(ezer));
	int max = 0;
	for (int i = 0; i < ezer.length; i++) {
		if(ezer[i]>max) {
			max = ezer[i];
		}	}
	System.out.println(max);
	}

}
