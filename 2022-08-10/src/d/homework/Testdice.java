package d.homework;

import javax.management.ValueExp;

public class Testdice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Dice d  = new Dice();


d.roll();
System.out.println(d.value);

int a=d.roll(); 
System.out.println(a); 
	// העליון והתחתון זהים רק הכתיבה שונה
System.out.println(d.value); 

	}

}
