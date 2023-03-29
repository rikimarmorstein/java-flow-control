package oop;

import java.util.Arrays;

public class SetOfPerson {

	Person[][] persons = new Person[10][10];
		int x = 0, y = 0;

	public boolean addPerson(Person p) {
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				if (persons[i][j] != null && persons[i][j].equals(p)) {
					return false;
				}

			}
		}
		persons[x][y] = p;
		if (x < 9) {
			if (y < 9) {
				y++;
			} else {
				y = 0;
				x++;
			}
		}
		return true;
	}

	public boolean contains(Person p) {
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				if (persons[i][j] != null && persons[i][j].equals(p)) {
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "SetOfPerson [persons=" + Arrays.toString(persons) + "]";
	}

	public Person findById(int id) {
		for (int i = 0; i < persons.length; i++) {
			for (int k = 0; k < persons[i].length; k++) {
				if (persons[i][k] != null && id == persons[i][k].getId()) {
								return persons[i][k];

				}
				}

			}
			return null;
	

			
		
	}
}
