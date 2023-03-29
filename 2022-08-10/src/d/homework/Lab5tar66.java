package d.homework;

public class Lab5tar66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = (int) (Math.random() * 100001);
		int rev = 0;
		int rcopy = r;
		
		while (r>0) {
			rev*=10;
			rev+=r%10;
			r/=10;
			
		}System.out.println(rcopy);
		System.out.println(rev);
		
		if (rcopy == rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");

		}
	}

}
