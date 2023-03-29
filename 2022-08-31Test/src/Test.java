import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
//1+2
		System.out.println("answer 2:");
		int[] nums1 = new int[15];
		int[] nums2 = new int[15];
		

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 10);

		}
		System.out.println(Arrays.toString(nums1));

		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(nums2));
//3
		System.out.println("answer 3:");
		int sum = 0;
		int sumn = 0;
		for (int i = 0; i < nums1.length - 2; i++) {
			sum = nums1[i] * 100 + nums1[i + 1] * 10 + nums1[i + 2];
			if (sum > sumn) {
				sumn = sum;
			}
		}
		System.out.println(sumn);
//4+5
		
		System.out.println("answer 5:");
		int[] ezer1 = new int[15];

		int a = 0;

		for (int i = 0; i < nums1.length; i++) {
			boolean found = true;
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					found = false;
					break;
				}
			}

			for (int k = 0; k <= a; k++) {
				if (found && nums1[i] == ezer1[k]) {
					found = false;

				}}if (found)
				ezer1[a++] = nums1[i];

		}
	//	System.out.println(Arrays.toString(ezer1));

		int[] ezer2 = new int[15];

		int n = 0;
		for (int i = 0; i < nums2.length; i++) {
			boolean found = true;
			for (int j = 0; j < nums1.length; j++) {
				if (nums2[i] == nums1[j]) {
					found = false;
					break;
				}
			}

			for (int k = 0; k <= n; k++) {
				if (found && nums2[i] == ezer2[k]) {
					found = false;

				}}if (found)
				ezer2[n++] = nums2[i];

		}
	//	System.out.println(Arrays.toString(ezer2));


		int[] distinct = new int[10];
		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = -1;
		}

		System.arraycopy(ezer1, 0, distinct, 0, a);
		System.arraycopy(ezer2, 0, distinct, a, n);


		
		

		System.out.println(Arrays.toString(distinct));
//6
		System.out.println("answer 6:");
		int num = 0;
		boolean zero=true;
		for (int i = 0; i < distinct.length; i++) {
			if (distinct[i] >=0) {
				if(distinct[i]==0) {
					zero = false;
				}
				num = num*10;
				num = num+distinct[i];
			}
		}if (zero=false) {
	System.out.print(num*10);
	}else {
		System.out.print(num);

	}
}}
