package homework;

public class Lab6tar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[40];
		
		int z = (int) (Math.random() * 39);
		System.out.println(z);
		
		arr[0] = 1;
		arr[1] = 1;
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
		
		for (int i = 2; i < arr.length - 1; i++) {
			arr[0] = 1;
			arr[1] = 1;
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(arr[i] + " ");}
		for (int i = 2; i < arr.length - 1; i++)
			if (z == i) {
				arr[i] = arr[z];
System.out.println();
				System.out.println(arr[i]);

			}
		}

	

}
