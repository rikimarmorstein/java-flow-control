package e.ui;

import java.util.Scanner;

public class Boom {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		Scanner sc1 = new Scanner(System.in);

		System.out.println("enter number");

		int num1 = sc.nextInt();
		int num2 = sc1.nextInt();
	//	int g = su(num1);

		 		sc.close();

		for (; num1 <= num2; num1++) {
			int g = su(num1);

			if (num1 % 7 == 0 || num1 % 10 == 7 || (num1 / 10) % 10 == 7 || 0 == 7  ) {
				System.out.print("boom ");
		
		} else if (g==7){
			System.out.print("boom ");

		}else {	
		
				System.out.print(num1 + " ");
		 }
	}}

	public static int su(int num) {
		int sum = 0;
		int p;
		while (num >= 0) {
			p = num % 10;
			num = num / 10;
			sum = sum + p;
		}
		return sum;
	}

}