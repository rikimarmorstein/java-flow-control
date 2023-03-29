package d.homework;

public class Lab4a68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = (int)(Math.random()*101);
		int den = (int)(Math.random()*11);
		
		System.out.println(max);
		System.out.println(den);
		
	for (int a = 1; a<max ;a++) {
		if (a%den==0)
			System.out.println(a);
	
}

		
	}
	
}
