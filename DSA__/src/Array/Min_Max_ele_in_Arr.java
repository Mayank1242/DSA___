package Array;

import java.util.Scanner;

public class Min_Max_ele_in_Arr {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter arr");
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			else if(min >arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("Max number is "+max);
		System.out.println("Min number is "+min);
		

		

		
	}
}
