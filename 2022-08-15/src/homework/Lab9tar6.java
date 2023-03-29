package homework;

public class Lab9tar6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[50];
		int z = 0;
		int l = 0;
		int v = 100;
		int m = 0;

		for (int i = 0; i < arr.length; i++) {
			int y = (int) (Math.random() * 101);
			arr[i] = y;
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++)
			if (z < arr[i]) {
				z = arr[i];
				l = i;
			}
		System.out.println("====");
		System.out.println(z);
		System.out.println(l);
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < v) {
				v = arr[i];
				m = i;
			}
		System.out.println("====");
		System.out.println(v);
		System.out.println(m);
	}

}
