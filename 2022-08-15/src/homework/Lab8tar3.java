package homework;

public class Lab8tar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int [10];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			int j = (int)(Math.random()*101);
			arr[i]=j;
			sum+=arr[i];
			System.out.println(arr[i]);
		}	System.out.println("====");
			System.out.println(sum);
			System.out.println(sum/10);	

		}
		
		



}
