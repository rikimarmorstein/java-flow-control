package d.homework;

public class Testperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person per = new Person();

per.id = 203515390;
per.age = 30;
per.name= "Riki";

System.out.println(per.age+" " + per.id);
System.out.println(per.name);


per.growUpOneYear();
System.out.println(per.age);

per.setAgeToTen();
System.out.println(per.age);

	}

}
