package c.flow.control.loops;

import java.util.Scanner;

public class Deno1while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int secretPassword = 1234;
		int c = 1;

		System.out.println("enter password: ");
		int input = sc.nextInt();
		c++;

		while (c <= 3 && input != secretPassword) {
			System.out.println("enter password: ");
			input = sc.nextInt();
			c++;
		}
		if (input == secretPassword) {
			System.out.println("you are loggen in ");

		} else {
			System.out.println("Unable to enter");

		}
		sc.close();
	}

}
