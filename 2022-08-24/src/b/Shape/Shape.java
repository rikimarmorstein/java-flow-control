package b.Shape;

public class Shape {

	private String color;
	
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	public Shape() {
		this("Black");
	}
	
	public String getColor() {
		
		return this.color;
	}
}
