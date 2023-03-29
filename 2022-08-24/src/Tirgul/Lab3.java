package Tirgul;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary");
		double salary = sc.nextDouble();

		double tax = 0;

		if (salary <= 23000) {
			tax = salary * 0.1;
		} else {
			tax = 23000 * 0.1;

			if (salary <= 50000) {
				tax = tax + (salary - 23000) * 0.2;
			} else {
				tax = tax + 27000 * 0.2;

				if (salary <= 100000) {
					tax = tax + (salary - 50000) * 0.3;
				} else {
					tax = 50000 * 0.3;
					tax = tax + (salary - 100000) * 0.4;
				}
			}
		}
		System.out.println(tax);
		System.out.println(salary - tax);
	sc.close();
	}

}
