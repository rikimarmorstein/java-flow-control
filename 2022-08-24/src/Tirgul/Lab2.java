package Tirgul;

public class Lab2 {

	public static void main(String[] args) {

int a = (int)(Math.random()*101);
System.out.println(a);
if(a>50) {
	System.out.println("Big");
}else if (a<50) {
	System.out.println("Small");
}else {
	System.out.println("Bingo");
}
if(a%2==0) {
	System.out.println("Even");
}else {
	System.out.println("Odd");
}


int max = 6000;
int min =5000;
int salary = (int)(Math.random()*max-min+1)+min;
System.out.println(salary);

if (salary*1.1<max) {
	System.out.println(salary*1.1);
}else {
	System.out.println(salary*1.05);
}
System.out.println("===");
int b = (int)(Math.random()*101);
int c = (int)(Math.random()*101);
int d = (int)(Math.random()*101);
System.out.println(b);
System.out.println(c);
System.out.println(d);
if (b>c &&b>d) {
	System.out.println(b);
}else if(c>b&&c>d) {
	System.out.println(c);
}else {
	System.out.println(d);
}
	}

}
