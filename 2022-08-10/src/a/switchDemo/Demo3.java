package a.switchDemo;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter grade: 0-10");
String grade= sc.nextLine()	;
sc.close();

switch (grade) {
case "0" :
case "1" :
case "2" :
case "3" :
case "4" :
case "5" :
break;
case "6" :
case "7" :
case "8" :
	System.out.println("good");
break;
case "9":
case "10":
	System.out.println("very good");
	break;
	default:
	
		System.out.println(grade + " is illegal grade");


}
	}

}
