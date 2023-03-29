package d.homework;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int year = sc.nextInt();
		sc.close();
		System.out.println("this year " + year);
		
		if (year%4==0 && year %100!=0 || year%400 == 0) {
			System.out.println("leap year");
			}else {
				System.out.println("not leap year");

			}
	}
}
