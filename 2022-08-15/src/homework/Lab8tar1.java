package homework;

public class Lab8tar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];

		for (int j = 0; j < arr.length; j++) {
			int i = (int) (Math.random() * 101);
			arr[j] = i;
			System.out.println(arr[j] + " ");
		}

	}

}
