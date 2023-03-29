package d.homework;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random()*101+ 0);
		System.out.println(a);
		if (a>0 && a<=50) {
			System.out.println("small!");
		} else {
			System.out.println("big!");
		}
		int b = a%2;
		if (b!=0) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
		
		double max  = 6000d;
		double min = 5000d;
		double salary = (int)(Math.random()*(max-min+1))+min;
		System.out.println(salary);
		if(salary*1.1<=6000) {
			System.out.println(salary*1.1);
		}else {
			System.out.println(salary*1.05);
		}
	}

}
