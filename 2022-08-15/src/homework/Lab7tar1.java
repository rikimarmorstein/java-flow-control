package homework;

public class Lab7tar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr = { 'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c' };
		int sum = 0;	
		int sum1 = 0;

		for (int i = 0; i < arr.length; i++)
			if (arr[i] == 'a') {
				sum += 1;
			}	System.out.println(sum);
			for (int i = 0; i < arr.length; i++)
 
			if (arr[i] == 'c') {
				sum1 += 1;
			}	System.out.println(sum1);
			

	}

}
