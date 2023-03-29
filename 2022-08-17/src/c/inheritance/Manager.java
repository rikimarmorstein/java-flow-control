package c.inheritance;

public class Manager extends Employee {

	public String department;

	public static void main(String[] args) {

		Manager m = new Manager();
		System.out.println(m.name);
		System.out.println(m.salary);
		System.out.println(m.birthDate);
		System.out.println(m.department);

		Employee e = new Employee();
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.birthDate);
		// System.out.println(e.department);
	}

}
