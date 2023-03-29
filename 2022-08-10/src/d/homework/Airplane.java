package d.homework;

public class Airplane {

	int altitude; // hight
	int direction; /// kivoon

	void goHigher10Yards() {
		altitude+=10;
	}

	void goLower10Yards() {
		altitude-=10;
	}

	
	void turnNorth() {
		direction = 0;
	}
	void turnEast() {
		direction = 90;

	}
	void turnSouth() {
		direction = 180;

	}
	void turnWest() {
		direction = 270;

	}
}
