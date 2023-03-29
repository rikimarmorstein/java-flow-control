package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lab10tar22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("enter..."+" ");
			arr[i] = sc.nextInt();
			System.out.print("before ");
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1+i; j < arr.length; j++) {
				if(arr[i]==arr[j])
				arr[j]=-1;
				
			}
		}
		System.out.println();
		System.out.print("after ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>-1)
			System.out.print(arr[i]+" ");
		
		}
sc.close();
	}
}
