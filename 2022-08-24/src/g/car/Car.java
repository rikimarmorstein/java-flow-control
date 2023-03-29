package g.car;

import java.util.Objects;

public class Car {

	private int number;
	private String color;
	private int speed;

	public Car(int number, String color, int speed) {
		super();
		this.number = number;
		this.color = color;
		this.speed = speed;
	}

	public int getNumber() {
		return number;
	}

	
	

	@Override
	public int hashCode() {
		return Objects.hash( number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && number == other.number && speed == other.speed;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", color=" + color + ", speed=" + speed + "]";
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void speedup(int val) {
		if ( speed+val <= 200) {
			speed=speed+val;
		}else {
			speed=200;
		}
	}

	public void slowdown(int val) {
		if (speed-val >= 0 ) {
			speed=speed-val;
		}else {
			speed = 0;
		}
	}

}
