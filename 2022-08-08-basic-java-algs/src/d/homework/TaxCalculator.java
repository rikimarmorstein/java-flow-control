package d.homework;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter salary");
int salary = sc.nextInt();
System.out.println(salary);

if (salary<23000){
	int tax = 10;
	System.out.println(tax+"%");
			System.out.println(salary*1.1);
} else if(salary >=23000 && salary <50000) {
	int tax = 20;
System.out.println(tax+"%");
System.out.println(salary*1.2);
	
} else if(salary >=50000 && salary <1000000) {
	int tax = 30;
	System.out.println(tax+"%");
	System.out.println(salary*1.3);
}else {int tax = 40;
System.out.println(tax+"%");
System.out.println(salary*1.4);
	
}


	sc.close();
	}
}
