package p;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String[] names = {"gil", "sara"};
		
		Person []persons=new Person[25];
				
		for (int i = 0, id=101; i < persons.length; i++, id++) {
		//	String name = names[(int)(Math.random()*names.length)];
		//	int age=(int)(Math.random()*119)+1;
			
			Person p=new Person(id, names[(int)(Math.random()*names.length)], (int)(Math.random()*100));
			persons[i]=p;
			
			System.out.println(persons[i]);
		//	System.out.println(p);
		}
	//	System.out.println(Arrays.toString(persons));
		
		
	}

}
