package c.flow.control.loops;

import java.util.Scanner;

public class Deno1while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int secretPasword = 1234;
		
		System.out.println("enter pasword: ");
		int input = sc.nextInt();
		
		while (input != secretPasword){
		System.out.println("enter pasword: ");
		input = sc.nextInt();
	}

	System.out.println("you are loggen in ");
	sc.close();
	}
}
