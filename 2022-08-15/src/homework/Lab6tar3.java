package homework;

public class Lab6tar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = (int)(Math.random()*41)+10;
int []arr = new int[y];
		
		
		for (int i=2; i<arr.length-1; i++) {
			arr[0]=1;
			arr[1]=1;
			arr[i] = arr[i-1] + arr[i-2];

				System.out.print(arr[i] +" ");
	}
	}
}
