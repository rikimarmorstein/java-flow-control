package a.miyunMaharach;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("1 enter num: ");
		int input = sc.nextInt();
		
		int m1 = input;
		int m2 = input;
		
		for (int i = 2; i <= 10; i++) {
			System.out.print(i+" enter num: ");
			input = sc.nextInt();
			if (m1==m2) {
				if (input>m1) {
					m1=input;
				}else {
					m2=input;
				}
			}else {
				if(input>m1) {
					m2=m1;
					m1=input;
				}else if (input<m1 && input>m2){
			m2 = input;
			}
			}
		}sc.close();
		System.out.println("second "+m2);
	}

	

}
