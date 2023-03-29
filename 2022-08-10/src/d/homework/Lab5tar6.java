package d.homework;

public class Lab5tar6 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = (int) (Math.random() * 100001);
		System.out.println(r);

if (r>9999)  {
		int a = r/10000;
		int b = (r/1000)%10;
		int c = (r/100)%10;
		int d = (r/10)%10;
		int e = r%10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		if (b==d && a==e) {
			System.out.println("palindrome ");
		}else {
			System.out.println("not palindrome ");
		}

}else if (r<=9999 && r>999) {
	int a = r/1000;
	int b = (r/100)%10;
	int c = (r/10)%10;
	int d = r%10;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	if (b==c && a==d) {
		System.out.println("palindrome ");
	}else {
		System.out.println("not palindrome ");
	}
} else if (r<=999 && r>99) {
	int a = r/100;
	int b = (r/10)%10;
	int c = r%10;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	if (a==c ) {
		System.out.println("palindrome ");
	}else {
		System.out.println("not palindrome ");
	}
		
	}else {
		int a = r/10;
		int b = r%10;
		System.out.println(a);
		System.out.println(b);
		if (a==b ) {
			System.out.println("palindrome ");
		}else {
			System.out.println("not palindrome ");
		}
		
	}
	}}

