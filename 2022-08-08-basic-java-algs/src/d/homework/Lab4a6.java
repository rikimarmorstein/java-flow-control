package d.homework;

public class Lab4a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 6000;
		int min = 5000;
		
		int salary  = (int)(Math.random()*(max-min + 1)+min);
		System.out.println(salary);
		
		if (salary * 1.1<max) {
			System.out.println(salary*1.1);
		}else {
			System.out.println(salary*1.05);
		}
	}

}
