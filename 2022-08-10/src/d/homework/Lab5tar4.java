package d.homework;

public class Lab5tar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 10000);
		
		int x = 0;
		int	b = 0;
		int	c = 0;
		int d = 0;

		System.out.println(a);

		if (a<10){
		System.out.println(a);
		}
		else if (a<100 && a>10) { 
				x = a/10;
				b = a%10;
		System.out.print(b);
		System.out.print(x);
		}
		else if (a<1000 && a>100) { 
			b = a%10;
			x=  a/100;
			c = (a/10)%10;
			System.out.print(b);
			System.out.print(c);
			System.out.print(x);
			}
		else  { 
			b = a%10;
			x = a/1000;
			c = (a%100)/10;
			d = (a/100)%10;
			System.out.print(b);
			System.out.print(c);
			System.out.print(d);
			System.out.print(x);
			}
	}

}
