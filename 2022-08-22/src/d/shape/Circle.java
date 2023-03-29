package d.shape;

public class Circle extends Shape {
	
	private double radius; 

	
	//public Circle() {
		
	//}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		//return  3.14*(radius*radius);
		return Math.pow(radius, radius);
	}
}
