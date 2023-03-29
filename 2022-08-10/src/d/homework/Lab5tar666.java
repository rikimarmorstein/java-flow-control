package d.homework;

import java.util.Scanner;

public class Lab5tar666 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int r=sc.nextInt();
		
		int n = 0;
		int s=r;
		
		while (r>0) {
		n=n*10;
		n=n+r%10;
		r=r/10;
		}System.out.println(n);
		
		if (s == n) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");

		}sc.close();
	}

}
