package homework;

import java.util.Arrays;

public class Lab6tar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = new int[40];
		
		//for (int i=2; i<arr.length-1; i++) {
			
		//	arr[i] = arr[i-1] + arr[i-2];
			//System.out.print(arr[a] +" ");
		//}
	//	arr[0]=1;
	//	arr[1]= 1;
	//	for (int i=2; i<arr.length-1; i++) {
	//	arr[0]=1;
		//arr[1]=1;
		//arr[i] = arr[i-1] + arr[i-2];

		//	System.out.print(arr[i] +" ");




			for (int i=2; i<(arr.length); i++) {
				arr[0]=1;
				arr[1]=1;
				
				arr[i] = arr[i-2] + arr[i-1];

					
		}System.out.println(Arrays.toString(arr));


	}
}
