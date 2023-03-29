package homework;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Lamm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] grades = new int[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < grades.length; i++) {
			System.out.println("enter grades: ");
			grades[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(Arrays.toString(grades));

		System.out.println("grade hight 8 ");
		for (int i = 0; i < grades.length; i++) {
			if (grades[i]>=8) {
				System.out.println(grades[i]);
			}
			
		}
		
	}

}
