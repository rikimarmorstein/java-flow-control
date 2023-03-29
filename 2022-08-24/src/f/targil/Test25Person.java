package f.targil;

import java.util.Arrays;

public class Test25Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "dan", "miri", "nira" };
		Person[] person = new Person[25];
		for (int i = 0, id = 101; i < person.length; i++, id++) {

			String name = names[(int) (Math.random() * names.length)];
			int age = (int) (Math.random() * 50);

			Person p = new Person(id, name, age);
			person[i] = p;

			System.out.println(person[i]);
		}
		System.out.println(Arrays.toString(person));
	}

}
