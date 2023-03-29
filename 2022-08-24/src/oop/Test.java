package oop;

public class Test {

	public static void main(String[] args) {



		SetOfPersonn set = new SetOfPersonn();
		Person p1 = new Person(308579267, "josh", 29);
		set.addPerson(p1);
		Person p=new Person(564,"jh",45);
		set.addPerson(p);
		System.out.println(set.contains(p));
	//	System.out.println(set.addPerson(p1));
	//	System.out.println(set.contains(p1));
System.out.println(set.findById(564));
System.out.println(set.findById(308579267));


	}

}
