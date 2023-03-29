package a.arraysdimensions;

import java.sql.Array;
import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]matrix = new int [4][5];
		matrix[3][2] = 5;
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
			
		}
		
	}

}
