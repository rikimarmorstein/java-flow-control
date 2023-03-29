package c.classs;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Point0 p = new Point0();	
	System.out.println("(" + p.x + "," + p.y + ")" );{
	p.moveRight();
	p.moveRight();
	p.moveRight();
	p.moveUp();
	p.moveUp();
	p.moveUp();
	p.moveUp();
	p.moveUp();
	System.out.println("(" + p.x + "," + p.y + ")" );
	}
	for (int x = 1; x<4; x++) {
		p.moveRight();
	}for (int y = 1; y<7; y++) {
	p.moveUp();
	}	System.out.println("(" + p.x + "," + p.y + ")" );

}}
