package h;

public class WLine extends Line{
private int width;

@Override
public void print() {
	for (int i = 0; i < width; i++) {
		super.print();
	
	}
	
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}


}
