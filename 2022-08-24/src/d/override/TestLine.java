package d.override;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Line line = new Line();

line.setLength(5);
line.print();

WLine wline = new WLine();
wline.setLength(5);
wline.setWidth(2);

wline.print();
	}
	

}
