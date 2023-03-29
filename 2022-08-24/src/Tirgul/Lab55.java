package Tirgul;

import java.util.Scanner;

public class Lab55 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 100001);
		System.out.println(a);
		
		int d=0;
		while (a>0) {
			d=d*10;
			d=d+(a%10);
			a=a/10;
		}System.out.println(d);
		if (a==d) {
			System.out.println("pali");
	}else {
		System.out.println("not");
	}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num 1: ");
		System.out.println("enter num 2: ");
		int s = sc.nextInt();
		int f = sc.nextInt();
		
		for (; s < f; s++) {
			if (s%7 ==0 || s%10==7 || s/10==7   ) {
				System.out.print("boom"+" ");
			}else {
				System.out.print(s + " ");
			}
			
		}
	}

}
