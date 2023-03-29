package oop;

public class Test {

	public static void main(String[] args) {

		SetOfPerson set = new SetOfPerson();
		Person p = new Person(5390, "riki", 30);
		set.addPerson(p);
		Person p2=new Person(223344862,"jh",8);
		set.addPerson(p2);
		Person p1 = new Person(308579267, "josh", 29);
		set.addPerson(p1);
		Person p3=new Person(564,"jh",45);
		set.addPerson(p3);
	
		System.out.println(set.addPerson(new Person(224312306,"zipi",6)));
		System.out.println(set.addPerson(new Person(343534715,"ari",5)));
		System.out.println(set.addPerson(new Person(229883087,"ushi",2)));

		System.out.println(set.findById(5390));
		System.out.println(set.findById(223344862));
		System.out.println(set.findById(308579267));
		System.out.println(set.findById(564));
		System.out.println(set.findById(224312306));
System.out.println(set.contains(new Person(343534715,"ari",5)));
System.out.println(set.contains(new Person(454545,"ari",5)));


		System.out.println(set.contains(p1));
		
		
		System.out.println(set.contains(p3));

	}

}
