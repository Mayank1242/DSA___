package linkedlist;
import java.util.*;
public class Collection_FrameWork_Linkedlist {
public static void main(String args[]) {
	LinkedList<Integer> list =new LinkedList<Integer>();
	
	list.addFirst(10);
	list.addLast(02201);
	list.addFirst(232);
	
	System.out.println("Before reversing:-> ");
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i) +"->");
	}
	System.out.print("NUll");
	//reverse
	System.out.println("\nafter reverse:->");
	System.out.print("NUll");
    Collections.reverse(list);
	for(int i=0;i<list.size();i++) {
	System.out.print( "->"+list.get(i) );
	System.out.println("done");
}
}
}
