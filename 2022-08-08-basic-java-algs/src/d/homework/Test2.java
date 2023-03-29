package d.homework;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 251 + 100);
		int b = (int) (Math.random() * 251 + 100);
		System.out.println(a + " minutes");
		System.out.println(b + " minutes");

		int minutesa = a % 60;
		int hoursa = a / 60;
		int minutesb = b % 60;
		int hoursb = b / 60;
		if (minutesa <10 && hoursa<10) {
		System.out.println("0" + hoursa + ":0" + minutesa);}
		else if (minutesa <10 && hoursa >10){
			System.out.println(hoursa + ":0" + minutesa);}
		else if (minutesa >10 && hoursa <10){
			System.out.println("0" + hoursa + ":" + minutesa);}
		else {System.out.println(hoursa + ":" + minutesa);}
		if (minutesb <10 && hoursb<10) {
			System.out.println("0" + hoursb + ":0" + minutesb);}
			else if (minutesb <10 && hoursb >10){
				System.out.println(hoursb + ":0" + minutesb);}
			else if (minutesb >10 && hoursb <10){
				System.out.println("0" + hoursb + ":" + minutesb);}
			else {System.out.println(hoursb + ":" + minutesb);}

		int c = (int) (Math.random() * 11 + 1);
		int x = (int) (Math.random() * 11 + 1);
		System.out.println(c);
		System.out.println(x);
		if (c > x) {
			System.out.println(c);
		} else {
			System.out.println(x);
		}

		int y = (int) (Math.random() * 101 + 0);
		System.out.println(y);
		if (y > 50) {
			System.out.println("big");
		}
		else if (y < 50) {
			System.out.println("small");
		} else {
			System.out.println("bingo");
		}
		
		

	}
}
