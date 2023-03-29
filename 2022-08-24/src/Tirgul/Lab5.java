package Tirgul;

public class Lab5 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 10001);
		System.out.println(a);
		
			int y=a;
			int b = 0;
			int sum = 0;
			while (y > 0) {
				b = y % 10;
				sum = sum + b;
				y = y / 10;

			}
			System.out.println(sum);
			System.out.println("===");
		
		
		int u=a;
		while (u > 10) {
			u = u / 10;
		
		}System.out.println(u);
		System.out.println("===");
		int j=a;
		int n=0;
		while (j>0) {
			n=n+1;
			j=j/10;
		}System.out.println(n);
		System.out.println("===");
		
		int g=a;
		int d=0;
		while (g>0) {
			d=d*10;
			d=d+(g%10);
			g=g/10;
		}System.out.println(d);
		
	}
	
}
