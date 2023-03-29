package d.homework;

import java.util.Iterator;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 1; i++) {
	System.out.println("hello world");
}
	int a = (int)(Math.random()*10)+1;
	for (int j = 1; j <= a; j++) {
		System.out.println(j);
	}
	System.out.println("=====");
	int x = (int)(Math.random()*10)+1;
	int y = (int)(Math.random()*10)+1;
	System.out.println(x);
	System.out.println(y);
if (x<y) {
	for(; x<=y;x++)
	System.out.println(x);
}else {
	for(; y<=x;y++)
	System.out.println(y);
}
	
}
}
	
