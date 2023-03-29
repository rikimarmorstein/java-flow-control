package d.homework;

public class LayerRaiser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double salary = (int)(Math.random()*1001+5000);
System.out.println("salary is " + salary);

if ((salary*1.1)<=6000) {
	System.out.println(salary*1.1);
}else {
	System.out.println(salary*1.05);
}

int b = (int)(Math.random()*101);
int c = (int)(Math.random()*101);
int d = (int)(Math.random()*101);
System.out.println(b);
System.out.println(c);
System.out.println(d);

if (b > c & b > d) {
	System.out.println(b);
}else if (c>b& c>d){
	System.out.println(c);
} else {
	System.out.println(d);
}

	}

}
