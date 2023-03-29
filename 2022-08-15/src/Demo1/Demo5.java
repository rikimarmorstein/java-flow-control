package Demo1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] grades = new int [5];
Scanner sc= new Scanner(System.in);
for (int i=0; i<grades.length; i++) {
	System.out.println("enter  ");
	grades[i] = sc.nextInt();
	}
sc.close();
System.out.println(Arrays.toString(grades));

System.out.println("best grades 8 and up");
for (int i = 0; i < grades.length; i++) {
	if(grades[i] >= 8) {
		System.out.println(grades[i]);
	}
}
}}
