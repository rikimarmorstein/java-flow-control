package b.loops;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Demo4dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int password = 123;
		int input;

		do {
			System.out.println("enter password ");
			input = sc.nextInt();
		} while (input != password);

		sc.close();
		System.out.println("you are loggin");
	}
}
