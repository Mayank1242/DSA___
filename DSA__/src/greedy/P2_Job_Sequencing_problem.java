package greedy;

import java.util.*;

// in job sequening problems you will get solution
//There will give a job and a deadline for it.
public class P2_Job_Sequencing_problem {
public static void main(String args[]) {
	Integer nums[]= {3,2,3,1,2,4,5,5,6};
	int k=4;
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]==keth) {
//			
//		}
//	}
	
	 ArrayList<Integer> arr=new ArrayList<>();
     Collections.addAll(arr,nums);
     
     Collections.sort(arr);
     
     System.out.println(arr.get(nums.length-k));
     
 }
}

