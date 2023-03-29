package d.homework;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;

		for (int a = 0; a < 100; a++) {
			int r = (int) (Math.random() * 1001);
			System.out.println(r);
			if (r > max) {
				max = r;
			}
		}
		System.out.println(max);

	}
}
