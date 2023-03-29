package c.animals;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[]animals= new Animal[5];
		animals[0] = new Animal();
		animals[1] = new Cat();
		animals[2] = new Dog();
		animals[3] = new Cow();
		animals[4] = new Poodle();

		animals[0].age =8;
		animals[1].age =4;
		animals[2].age =5;
		animals[3].age =8;
		animals[4].age =3;

				
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].getClass().getSimpleName() + " :age " + animals[i].age);
			animals[i].speak();
			
			if (animals[i] instanceof Cat) {
				Cat cat = (Cat)animals[i];
				cat.climb();
			}
			}
	}

}
