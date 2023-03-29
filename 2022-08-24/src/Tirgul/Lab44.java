package Tirgul;

public class Lab44 {

	public static void main(String[] args) {


		int a = (int)(Math.random()*7)+1;
		System.out.println(a);
		
		int y=1;
		for (int i = 1; i <=a; i++) {
			y=y*i;
		}System.out.println(y);
	}

}
