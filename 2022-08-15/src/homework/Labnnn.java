package homework;

import java.util.Arrays;

import javax.naming.event.NamespaceChangeListener;

public class Labnnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = new int [5][3];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*101);	
			}
			
		System.out.println(Arrays.toString(matrix[i]));
		
		}
	}

}
