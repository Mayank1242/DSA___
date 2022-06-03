package stack;

import java.util.Stack;
import java.util.Vector;

public class Q1_Next_Largest {
	
public static void next_larg() {
	
}
public static void main(String args[]) {
	int arr[]= {1,2,0,0,1,2,4};
	int size=arr.length;
	
	Vector<Integer> v=new Vector<>();
	Stack<Integer>  s= new Stack<>();
	for(int i=size-1;i>=0;i--) {
		
		
	  if(s.size()==0) {
		  v.add(-1);
	  }else if(s.size()>0 && s.firstElement()>arr[i]) {
		  v.add(s.firstElement());
		  
	  }else if(s.size()>0 && s.firstElement()<=arr[i]) {
		  while(s.size()>0 && s.firstElement()<=arr[i]) {
			  s.pop();
		  }
		  if(s.size()==0) {
			  v.add(-1);
		  }else {
			  v.add(s.firstElement());
		  }
	  }
	  s.push(arr[i]);
	}
	
	for(int i=0;i<size;i++) {
		System.out.print(arr[i] +" ");
		
	}
	System.out.println("\n");
	for(int i=size-1;i>=0;i--) {
		System.out.print(v.get(i) +" ");
		
	}
	
}
}
