package homework;

public class Lab8tar7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = new int[10];
		int z=100;
		int l=0;
		
		for (int i = 0; i < arr.length; i++) {
			int a = (int)(Math.random()*101);
			arr[i]= a;
			if (arr[i]<z) {
				z=arr[i];
				l=i;
				}System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.println("===");
		System.out.println(z);
		System.out.println(l);
	}

}
