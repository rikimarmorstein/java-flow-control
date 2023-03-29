package b.flow.control.ifDemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = (int) (Math.random()*11);
		System.out.println(r);
		
		int g = (int) (Math.random()*11);
		System.out.println(g);
		
		if (r>g) {
			System.out.println(r);

		}else {
				System.out.println(g);
		}
		}
}
