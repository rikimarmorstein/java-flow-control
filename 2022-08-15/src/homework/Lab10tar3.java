package homework;

public class Lab10tar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 11);
			arr[i] = r;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
			for (int i = 0; i < arr.length /2; i++) {
				int u = arr[i];
				arr[i] = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = u;
				u = arr[i];

			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		
	}
}
