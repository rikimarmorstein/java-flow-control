package c.flow.control.loops;

import java.util.Scanner;

public class Deno1while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int secretPassword = 1234;

		System.out.println("enter password: ");
		int input = sc.nextInt();

		for (int i = 0; i < 2; i++) {
			if (input == secretPassword) {
				System.out.println("you are loggen in ");

				break;
			} else {
				System.out.println("enter password: ");
				input = sc.nextInt();
			}

		}
		if (input != 1234) {
			System.out.println("Unable to enter");

		}
		sc.close();
	}

}
