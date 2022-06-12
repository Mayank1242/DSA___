package graph;
import java.util.*;



public class Trial {
	


public static void addedege(ArrayList<ArrayList<Integer>> adj, int sourse,int dest) {
	adj.get(sourse).add(dest);
	adj.get(dest).add(sourse);
}
	
	
public static void main(String args[]) {
Integer arr[]= {3,4,5,4,4};
//ArrayList<Integer> list=new ArrayList<Integer>();
//Collections.addAll(list,arr);
List lt=Arrays.asList(arr);
//for(int it:arr) {
//	list.add(it);
//}
Collections.sort(lt);
System.out.println();
}	
}
