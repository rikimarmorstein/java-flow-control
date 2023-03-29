package Tirgul;

public class Lab1 {

	public static void main(String[] args) {


		String part1 ="There will be";
		int visitors = 5;
		String part2 = "people for dinner";
		System.out.println(part1 + " " + (visitors+2) + " " + part2);
		
		int a = (int)(Math.random()*251)+100;
		System.out.println(a);
System.out.println("minutes: " +a);
int minutes = a%60;
int hours = a/60;
if (minutes<10 ) {
	System.out.println("0" + hours + ":" + "0" + minutes);
}else {  
	System.out.println("0" + hours + ":"  + minutes);


}

	}

}
