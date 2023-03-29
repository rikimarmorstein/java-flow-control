package b.Shape;

public class Rectangle extends Shape {

	private int length;
	private int width;
	
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length=length;
		this.width = width;
	}
	public Rectangle(int length, int width) {
		this("black",length, width );
	}
	
	public Rectangle(int side) {
		this(side, side);
	}
}
