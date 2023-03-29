package d.homework;

public class Lab5tar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*10001);
		System.out.println(a);
		
		
	
	while (a>=10) {
	a=a/10;
	}
		System.out.println(a);
	System.out.println("===");
	int n = (int)(Math.random()*10001);
	System.out.println(n);
	for(; n>=10; n=n/10);{
		System.out.println(n);
	}
	}
}
