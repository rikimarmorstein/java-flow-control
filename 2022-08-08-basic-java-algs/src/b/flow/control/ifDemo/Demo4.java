package b.flow.control.ifDemo;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = (int) (Math.random()*11);
		System.out.println(r);
		
		int g = (int) (Math.random()*11);
		System.out.println(g);
		
		int max = r>g ? r : g;
				System.out.println(max);
		
		}
}
