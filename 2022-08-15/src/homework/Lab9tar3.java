package homework;

public class Lab9tar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int [10];
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			int y = (int)(Math.random()*101);
			arr[i] = y;
			
		System.out.print(arr[i] + " ");
		
		}for (int i = 0; i < arr.length; i++)
			if (arr[i]%2==0) {
				sum+=arr[i];
			}System.out.println("===");
		System.out.println(sum);
		
	}

}
