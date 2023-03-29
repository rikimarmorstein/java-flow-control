package b.oop;

import java.util.Scanner;

public class Persontest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Person p=new Person();
		System.out.println("enter id: ");
		p.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("enter name: ");
		p.setName(sc.nextLine());
		
		System.out.println("enter age: ");
		p.setAge(sc.nextInt());
		
		
		sc.close();
		
		System.out.println(p.getId());
p.print()	;
}

}
