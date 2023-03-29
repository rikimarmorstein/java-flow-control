package Tirgul;

import java.util.Scanner;

public class Lab33 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter year");
int year = sc.nextInt();

if (year%4 ==0 && year%100!=0 || year%400==0) {
	System.out.println("meho");
}else {
	System.out.println("not");
}

	}

}
