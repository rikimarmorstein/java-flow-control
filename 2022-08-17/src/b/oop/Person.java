package b.oop;

public class Person {

	private int id;
	private String name;
	private int age;

	// constructor
	public Person() {

	}

	public Person(int id, String name, int age) {
		setId(id);
		setName(name);
		setAge(age);
	}
//metoda

	public void print() {
		System.out.println("Person: id " + id + " age: " + age + " name: " + name);
	}

	public void setAge(int theNewAge) {
		if (theNewAge >= 0 && theNewAge <= 120) {
			age = theNewAge;
		}
	}

	public void setId(int id) {
		if (id >= 0) {
			this.id = id;
		}
	}

	public void setName(String name) {
		if (name.length() < 25) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
