package Tirgul;

public class Lab4 {

	public static void main(String[] args) {


		int a = (int)(Math.random()*101);
	System.out.println(a);
	for (int i = 0; i < a; i++) {
		System.out.print(1+i + ",");
	}System.out.println("====");
	
	int b = (int)(Math.random()*101);
	int c = (int)(Math.random()*101);
System.out.println(b);
System.out.println(c);
if (b<c) {
	for (; b <= c; b++) {
		System.out.print(b + ",");
		
	}
}else {
	for (; c <= b; c++) {
}
	System.out.print(c + ",");
}System.out.println("====");
int d = (int)(Math.random()*101);
System.out.println(d);
for (int i = 0; i <= d; i++) {
	if (i%2==0) {
		System.out.print(i+",");
	}
}System.out.println("====");
int max = (int)(Math.random()*101);
int den = (int)(Math.random()*11);
System.out.println(max);
System.out.println(den);
for (int i = 0; i <= max; i++) {
if (i%den==0) {
	System.out.print(i + ",");
}
}
	}

}
