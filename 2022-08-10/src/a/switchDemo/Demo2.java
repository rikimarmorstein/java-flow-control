package a.switchDemo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter number: [1,2,3]");
String key= sc.nextLine()	;
sc.close();

switch (key) {
case "1":
	System.out.println("one");
break;
case "2":
	System.out.println("twoo");
break;
case "3":
	System.out.println("three");
	break;
	default:
	
		System.out.println(key + "is illegal");


}
	}

}
