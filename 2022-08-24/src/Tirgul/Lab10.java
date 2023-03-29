package Tirgul;

import java.util.Arrays;

public class Lab10 {

	public static void main(String[] args) {


		int [][]grades = new int[20][10];
	int sumk=0;	
	int x=0;
for (int i = 0; i < grades.length; i++) {
	int sum = 0;
	for (int j = 0; j < grades[i].length; j++) {
		grades[i][j] = (int)(Math.random()*21)+80;
sumk = sumk +grades[i][j];
	sum = sum + grades[i][j];
	x=x+1;
}System.out.println(Arrays.toString(grades[i]));
System.out.println(sum/grades[i].length);
		
}	System.out.println(sumk/x);
		}

}
