package d.homework;

public class Lab1tar345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=(int)(Math.random()*101);
		int b=(int)(Math.random()*101);
System.out.println(a);
System.out.println(b);

if(a>b) {
	System.out.println(a);
}else {
	System.out.println(b);
}

int c = (int)(Math.random()*251)+100;
int d = (int)(Math.random()*251)+100;
System.out.println(c + " minutes");
System.out.println(d + " minutes");
int y=c/60;  //hours
int e=c%60;  //minutes
int r=d/60;  //hours
int f=d%60;  //minutes
if (y<10 && e<10) {
	System.out.println("0" + y + ":0"+e);
} else if (y<10&& e>9) {
	System.out.println("0" + y + ":"+e);
}else if (y>9 && e<10) {
	System.out.println(  y + ":0"+e);
} else {
	System.out.println(y+":" + e);
}
if (r<10 && f<10) {
	System.out.println("0" +r + ":0"+f);
} else if (r<10&& f>9) {
	System.out.println("0" +r + ":"+f);
}else if (r>9 && f<10) {
	System.out.println( r + ":0"+f);
} else {
	System.out.println(r+":" + f);
}

	}

}
