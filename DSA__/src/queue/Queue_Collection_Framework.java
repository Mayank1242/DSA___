package queue;
import java.util.*;
public class Queue_Collection_Framework {
public static void main(String args[]) {
	Queue<Integer> q=new LinkedList<>();
	q.add(100);
	q.add(101);
	q.add(212);
	
	while(!q.isEmpty()) {
		System.out.println(q.peek());
		q.remove();
	}
	
	
	
}
}
