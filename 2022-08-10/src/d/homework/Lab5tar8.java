package d.homework;

import java.util.logging.Handler;

public class Lab5tar8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = (int) (Math.random() * 10001);
		System.out.println(n);
int m=0;
		int h = 0;
		while (n > 0) {
			m = n % 10;
			h = h + m;
		n=n/10;
		}System.out.println(h);
		System.out.println("===");

		int g = (int) (Math.random() * 10001);
		System.out.println(g);

		int j = 0;
		int v = 0;
		do {
			j = g % 10;
			v = v + j;
			g = g / 10;
		} while (g > 0);
		System.out.println(v);
	}
}
