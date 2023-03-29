package d.homework;

public class Tero5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);
		int d = (int) (Math.random() * 101);
		int e = (int) (Math.random() * 101);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("-------------");

		int max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;

		}
		if (e > max) {
			max = e;
		}
		System.out.println(max);

	}
}
