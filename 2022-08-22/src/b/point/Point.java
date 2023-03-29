package b.point;

public class Point {
	
	private int x;
	private int y;

public Point() {
	
}

public Point(int x, int y){
	this.x = x;
	this.y=y;
	
}

public Point (int value){
	this.x = value;
	this.y= value;
}

public void moveRight() {
	x++;
}

public void moveUp() {
	y++;
}

public void print() {
	System.out.println("(" + x + ", " + y + ")");
}


}
