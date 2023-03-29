package homework;

import java.util.Arrays;

public class Labmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] kol = new char[7][10];

		for (int i = 0; i < kol.length; i++) {
			for (int j = 0; j < kol[i].length; j++) {
				kol[i][j] = '0';

			}
			kol[0][0] = 'x';
			kol[6][9] = 'x';

			System.out.println(Arrays.toString(kol[i]));
		}
	}
}
