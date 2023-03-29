package a.switchDemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter mode: [off,on,law,medium,heig]");
String mode= sc.nextLine()	;
sc.close();

switch (mode) {
case "off":
	System.out.println("turn over off");
break;
case "on":
	System.out.println("turn over on");
break;
case "law":
	System.out.println("turn over ro 100");
break;
case "medium":
	System.out.println("turn over to 200");
break;
case "heig":
	System.out.println("turn over to 300");
break;
default:
System.out.println(mode + "is not supp...");



}
	}

}
