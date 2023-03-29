package d.homework;

public class Max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max1 = 0;
		int max2 = 0;

		for (int a = 0; a < 100; a++) {
			int r = (int) (Math.random() * 1001);
			System.out.println(r);
			if (r > max1) {
				max1 = r;
			}else  {
				
			}
		}
		System.out.println(max1);

	}
	

}
