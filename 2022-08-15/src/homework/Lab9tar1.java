package homework;

public class Lab9tar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int a = (int) (Math.random() * 101);
			arr[i] = a;

			
		System.out.print(arr[i] + " ");
			}				System.out.println("====");

		for (int i = 0; i < arr.length; i++) 
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
		
		}}
}
