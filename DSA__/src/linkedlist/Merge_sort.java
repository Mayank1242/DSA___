package linkedlist;
import java.util.*;
public class Merge_sort {

public static void main(String args[]) {
	
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("sa");
	int x=sc.nextInt();
	int val=0;
	while(x!=0){
	    ArrayList<Integer> list=new ArrayList<Integer>();
	   int n=sc.nextInt();
	   int m=sc.nextInt();
	   
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++){
	           arr[i]=sc.nextInt();
	       
	   }
	   
	     for(int i=0;i<n;i++){
	       for(int j=0;j<n;j++){
	          val=arr[i]+arr[j] + Math.floorMod((arr[i]-arr[j]),m);
	          list.add(val);
	       }
	   }
	    
	     int max=list.get(0);
	     for(int i=0;i<list.size();i++) {
	    	 if(max<list.get(i)) {
	    		max= list.get(i);
	    	 }
	     }
	  System.out.println(max);
	    x--;
	}
}
}
