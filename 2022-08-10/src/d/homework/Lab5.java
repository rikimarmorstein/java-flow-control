package d.homework;

import java.util.stream.IntStream;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int)(Math.random()*10001);
		System.out.println(a);

		int sum= 0;
		
		do { a=a/10;
		sum = sum+1;
					
		} while (a>0); 
System.out.println(sum);

System.out.println("===");
int b = (int)(Math.random()*10000);
System.out.println(b);

int s = 0;
for (; b>0;b=b/10 ) 
s=s+1;
System.out.println(s);

	}

}
