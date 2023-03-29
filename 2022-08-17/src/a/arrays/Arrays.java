package a.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//dynamic
		int[][] arr = new int[5][];
		arr[0] = new int[5];
		arr[1] = new int[4];
		arr[2] = new int[8];
		arr[3] = new int[7];
		arr[4] = new int[2];
//static
		int[][] arr2 = { { 2, 5, 4 }, { 5, 5, 4, 6 }, { 5, 4, 8, 7, 4, 5 } };

		int[][] arr3 = new int[3][];
		for (int i = 0; i < arr3.length; i++) {
			int length = (int) (Math.random() * 10) + 3;
			arr3[i] = new int[length];

		}
		System.out.println("end");

	}
}
