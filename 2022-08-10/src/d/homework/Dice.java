package d.homework;

public class Dice {

	int value;

	int roll() {
		value = (int) (Math.random() * 6) + 1;
		return value;
	}

}
