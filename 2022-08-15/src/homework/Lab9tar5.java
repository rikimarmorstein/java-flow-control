package homework;

public class Lab9tar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = new int[10];
		int sum = 0;
		int sumn=0;
		
		for (int i = 0; i < arr.length; i++) {
			int a = (int)(Math.random()*101);
			arr[i] = a;
			System.out.print(arr[i]+" ");
		}for (int i = 0; i < arr.length; i++)
			if (arr[i]%2==0) {
				sum+=arr[i];
			}else {
				sumn+=arr[i];
			}System.out.println("===");
		System.out.println(sum);
		System.out.println(sumn);
		if (sum>sumn) {
			System.out.println("===");
			System.out.println(sum);
		}else {
			System.out.println("===");
			System.out.println(sumn);
		}
	}

}
