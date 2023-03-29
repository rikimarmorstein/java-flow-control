package homework;

import java.util.Arrays;

public class Lab10tar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grades = new int[20][10];
		double sum = 0;
		double sumk = 0;
		int x = 0;
		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				grades[i][j] = (int) (Math.random() * 21) + 80;
				sum += grades[i][j];
				sumk += grades[i][j];
				x = x + 1;
			}
			System.out.println(Arrays.toString(grades[i]));
			System.out.println("grade memuza " + sum / grades[i].length);
			sum = 0;
		}

		System.out.println("grades memuza class " + sumk / x);
		System.out.printf("grades memuza class %1.2f%n", sumk / x);

	}
}
