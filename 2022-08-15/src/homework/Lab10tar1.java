package homework;

public class Lab10tar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 1, 2, 3, 3, 2, 1, 9, 5, 1, 1, 9 };
		int sum = 0;
		int sumn = 0;
		for (int i = 0; i < arr.length; i++)

			if (arr[i] == 3) {
				sum += 1;
			}
		System.out.println(sum);

		for (int i = 0; i < arr.length; i++)

			if (arr[i] == 1) {
				sumn += 1;
			}
		System.out.println(sumn);
		for (int i = 0; i < arr.length; i++)

		System.out.print(arr[i]+" ");

	}

}
