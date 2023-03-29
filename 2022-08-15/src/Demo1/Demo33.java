package Demo1;

import java.util.Arrays;

public class Demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];
		names[0]="dan";
		names[1]="riki";
		names[2]="noa";
		names[3]="sima";
		names[4]="lolo";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
	}
		String str= Arrays.toString(names);
		System.out.println(str);
		
	}
}
