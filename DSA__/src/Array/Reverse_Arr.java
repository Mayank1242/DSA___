package Array;
import java.util.Scanner;
public class Reverse_Arr {
public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=4;
			int arr[]=new int[5];
			System.out.println("Enter arr");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Before revrese");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			System.out.println("After revrese");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
			}
		}
}

