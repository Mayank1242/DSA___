package graph;
import java.util.*;



public class Trial {
	


public static void addedege(ArrayList<ArrayList<Integer>> adj, int sourse,int dest) {
	adj.get(sourse).add(dest);
	adj.get(dest).add(sourse);
}
	
	
public static void main(String args[]) {
int arr[]= {3,4,5,4,4};

ArrayList<Integer> list=new ArrayList<Integer>();
for (int i : arr) {
    list.add(i);
}
Collections.sort(list);
//System.out.println(list);

//ListIterator<Integer> listItr2 = list.listIterator(list.size());
//while(listItr2.hasPrevious())
//{
//    int ele = listItr2.previous();
//    System.out.println(ele);
//}
for(int i=0;i<list.size();i++) {
	System.out.print(list.get(i)+" ");
}
//Collections.addAll(list,arr);
////List lt=Arrays.asList(arr);
//////for(int it:arr) {
//////	list.add(it);
//////}
//Collections.sort(lt);

//
//for(int i=0;i<list.size();i++) {
//	System.out.println(list.get(i));
//	

}	
}
