package Array;

import java.util.Scanner;
import java.util.*;
public class Kth_max_min_arr {
	
	 public static int kthSmallest(Integer[] arr,
             int k)
{
// Sort the given array
Arrays.sort(arr);

// Return k'th element in
// the sorted array
return arr[k - 1];
}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter arr");
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("kth largest element");
		
		
	
	}
}
