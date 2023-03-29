package b.oop;

public class Persontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();

		p.setAge(25);

		System.out.println(p.getAge());

		p.setName("riki");
		System.out.println(p.getName());

		p.setId(203515390);
		System.out.println(p.getId());
		p.print();

	}

}
