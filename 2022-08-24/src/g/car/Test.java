package g.car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car(100, "red", 200);
		System.out.println(c.toString());

		c.speedup(0);
		c.slowdown(250);
		System.out.println(c.toString());
	}

}
