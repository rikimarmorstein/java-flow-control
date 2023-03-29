package d.homework;

import java.util.Scanner;

public class Labs7tar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary");
		double salary = sc.nextDouble();
		
		sc.close();
		
		
		if (salary <=23000) {

			System.out.println(salary*0.1);
			System.out.println(salary*1.1);
		} else if (salary >23000 && salary <=50000) {

			System.out.println(23000*0.1+ (salary-23000)*0.2);
			System.out.println(23000*1.1 + (salary-23000)*1.2);
		}else if (salary >50000 && salary <=100000) {

			System.out.println(23000*0.1+ 27000*0.2 + (salary-50000)*0.3);
			System.out.println(23000*1.1 +27000*1.2 + (salary-50000)*1.3);
		} else {
			System.out.println(23000*0.1+ 27000*0.2 + 50000 * 0.3 + (salary-100000)*0.4);
			System.out.println(23000*1.1 +27000*1.2 + 50000*1.3 +  (salary-100000)*1.4);
	}
	}
}
