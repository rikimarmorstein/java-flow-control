package d.homework;

import java.util.Scanner;

public class Rishony2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		boolean rishuny = true;
		for (int i = 2; i < num/2; i++) 
			if (num % i == 0) {
				rishuny = false;
//			System.out.println(i +" " + rishuny);
		
			}if (rishuny == true) {
					System.out.println("rishuny");
				
			}		 else {
				System.out.println("not");

			}

		

		sc.close();
	}

}
