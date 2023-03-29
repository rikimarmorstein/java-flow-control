package d.homework;

import java.util.Scanner;

public class Rishony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		for (int i = 2; i<num; i++) 
			if(num%i ==0) {
				System.out.println("not rishuny");
				break;
			}else {	
			System.out.println("rishuny");
			break;
		}
		
		
		
		
		
		sc.close();
	}

}
