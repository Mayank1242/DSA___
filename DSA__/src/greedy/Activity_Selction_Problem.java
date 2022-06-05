package greedy;

import java.util.ArrayList;
import java.util.Collections;

public class Activity_Selction_Problem {

	public static void main(String args[]) {
		int n=6;
		ArrayList<Integer> Start=new ArrayList<>();
		ArrayList<Integer> Finsih=new ArrayList<>();
		 Integer S[]  =  {1, 3, 0, 5, 8, 5};
		 
		Integer	F[] =  {2, 4, 6, 7, 9, 9};
		
		Collections.addAll(Start, S);
		Collections.addAll(Finsih, F);


		
		int j=0;
		System.out.print(j+ " ");

		Collections.sort(Finsih);
		
		for(int i=1;i<n;i++) {
			if(Start.get(i)>=Finsih.get(j)) {
				System.out.print(i+ " ");
				j=i;
			}
		}
		
		
		
		
		
	}
	
}
