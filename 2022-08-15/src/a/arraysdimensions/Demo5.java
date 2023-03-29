package a.arraysdimensions;import java.awt.print.Printable;
import java.util.Arrays;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [][]cinema = new char [7][10];

for (int i = 0; i < cinema.length; i++) {
		for (int j = 0; j < cinema[i].length; j++) {
			cinema [i][j] = '0';
			cinema[0][0] = 'x';

			cinema[cinema.length-1][cinema[0].length-1] = 'x';
			
		}System.out.println(Arrays.toString(cinema[i]));
	}


	

	System.out.println("===cinema===");
	for (int i = 0; i < cinema.length; i++) {
		for (int j = 0; j < cinema[i].length; j++) {
			
			System.out.print(cinema[i][j] + " ");
		}
System.out.println();}
	
	}

}
