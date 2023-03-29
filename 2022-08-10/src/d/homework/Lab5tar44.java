package d.homework;

public class Lab5tar44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 10000);

		System.out.println(a);

		do {
			System.out.print(a % 10);
			a = a / 10;
		} while (a > 10);
		{
			System.out.print(a % 10);
		}
		System.out.println();
System.out.println("====");
		int b = (int) (Math.random() * 10000);
		System.out.println(b);
		while (b > 0)
			
		{
			System.out.print(b % 10);
			b = b / 10;
		}

	}

}
