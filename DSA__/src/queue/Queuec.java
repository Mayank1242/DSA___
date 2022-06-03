package queue;


 class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}

 class queue{
	static node head=null;
	static node tail=null;
	
	public static boolean isEmpty() {
		return head==null & tail==null;
	}
	
	public static void add(int data) {
		node newnode =new node(data);
		if(tail==null) {
			tail=head=newnode;
			return;
		}
		tail.next=newnode ;
		tail=newnode;
	}
	public static int remove() {
		if(isEmpty()) {
			System.out.println("ene");
			return -1;
		}
		int front =head.data;
		if(head==tail) {
			tail=null;
		}
		head=head.next;
		return front;
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
		}
		return head.data;
	}
}
 
public class Queuec {
	
public static void main(String args[]) {
	queue q =new queue();
	q.add(10);
	q.add(11);
	q.add(120);
	while(!q.isEmpty()) {
		System.out.println(q.peek());
		q.remove();
		
	}
}
}
