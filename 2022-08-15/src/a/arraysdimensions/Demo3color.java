package a.arraysdimensions;

import java.util.Arrays;

public class Demo3color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[10][3];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 251);

			}
			System.out.println(Arrays.toString(matrix[i]));
			}
		}
	

}
