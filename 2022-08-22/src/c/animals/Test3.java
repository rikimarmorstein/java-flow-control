package c.animals;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog=new Dog();
		Cat cat = new Cat();
		makeAnimalSpeak(dog);
		makeAnimalSpeak(cat);
		
		//or
		Animal animal;
		animal = new Dog();
		makeAnimalSpeak(animal);
		animal = new Cat();
		makeAnimalSpeak(animal);
		
	}
public static void makeAnimalSpeak(Animal animal) {
	animal.speak();
}

}
