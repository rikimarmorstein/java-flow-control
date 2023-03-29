package a;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		System.out.print("enter 1 namber: ");
		int a = sc.nextInt();
		System.out.print("enter 2 namber: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println(sum);
		sc.close();
		
	}

}
