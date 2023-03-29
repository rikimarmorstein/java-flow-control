package a;

public class Demo6random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((int)(Math.random()*11));
		int a = (int)(Math.random()*101);
		System.out.println(a);

		int b = (int)(Math.random()*6);
		System.out.println(b);
		
		int c = (int)(Math.random()*11+10);
		System.out.println(c);
		
		int low = 8;
				int high = 22; 
				int d = (int)(Math.random()*(high-low + 1)) + low;
				System.out.println(d);
	}

}
