package d.homework;

import java.util.Scanner;

public class TaxCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary: ");
		double salary = sc.nextDouble();
		double tax = 0D;
		sc.close();

		if (salary <= 23000) {
			tax = salary * 0.1;
		} else {
			tax = 23000 * 0.1;
		
				if (salary <= 50000) {
			tax += (salary - 23000) * 0.2;
		} else {
			tax += 27000 * 0.2;
		
				if (salary <= 100000) {
			tax += (salary - 50000) * 0.3;
		} else {
			tax += 50000 * 0.3;
			tax += (salary - 100000) * 0.4;
		
		}}}

		System.out.println(salary);
		System.out.println(tax + "שח");
		System.out.println(salary - tax);

	}

}
