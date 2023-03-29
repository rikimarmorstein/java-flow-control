package c.animals;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.age=4;
		Poodle poodel = new Poodle();
		Cat cat=new Cat();
		Cow cow = new Cow();
		cow.age =3;
		
		System.out.println(dog.age);
		System.out.println(cow.age);

		dog.speak();
		cow.speak();	
		poodel.speak();
cat.speak();
	}

}
