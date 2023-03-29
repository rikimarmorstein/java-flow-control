package c.classs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1 = new Car();
Car c2 = new Car();

c1.number = 123;
c2.number = 123;

c1.color  ="red";
c1.speed = 30;
	System.out.println(c1.number);
	System.out.println(c1.color);
	System.out.println(c1.speed);

	c1.drive();
	System.out.println(c1.speed);
	c1.stop();
	System.out.println(c1.speed);
	
	}

}
