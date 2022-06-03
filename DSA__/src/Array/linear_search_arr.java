package Array;
import java.util.*;
public class linear_search_arr {
	public static void linear_search(int arr[],int n,int ele) {
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				System.out.println("Element " + ele + " is in " + i+1 + " postion");
			}
		}
	}
public static void main(String args[]) {
	int arr[]= {12,3,4,2,4,4};
	int n=arr.length;
//	int ele=4;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element you want to search: ");
	int ele=sc.nextInt();
	linear_search(arr,n,ele);
	
}
}
