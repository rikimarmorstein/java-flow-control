package d.homework;

import java.util.logging.Handler;

public class Lab5tar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = (int) (Math.random() * 10001);
	
			System.out.println(r);
			
			int s = 0;
			for (int a = 0; r > 0; a++) {
				r = r / 10;
				s = s + 1;
			}
			System.out.println(s);
			System.out.println("------");

			int z = (int) (Math.random() * 10001);
			System.out.println(z);
			for (int b = 1; z > 10; b++) {
				z = z / 10;
			}
			System.out.println(z);
			System.out.println("------");

			int d = (int) (Math.random() * 10001);
			System.out.println(d);

			int y = 0;
			for (int e = 0; d > 0; e++) {
				int p = d % 10;
				y = y + p;
				d = d / 10;
			}
			System.out.println(y);
			System.out.println("------");
		
			int w = (int) (Math.random() * 10001);
System.out.println(w);
			while (w > 0) {
				System.out.print(w % 10);
				w = w / 10;
			}
			
	}
}
