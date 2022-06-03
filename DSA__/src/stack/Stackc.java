package stack;
  class node {
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
		
	}
}
class stack{
	public static node head;
	public static boolean isEmpty() {
		return head==null;
	}
	
	public static void push(int data) {
		node newnode =new node(data);
		if(isEmpty()) {
			head=newnode;
			return;
		}
		
		newnode.next=head;
		head=newnode;
		
	}
	
	public static int pop() {
		if(isEmpty()) {
			System.out.println("Stat=ck is empty cant pop");
			return -1;
		}
		
		int top=head.data;
		head=head.next;
		return top;
	}
	
	public static int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty cant peek");
			return -1;
		}
		return head.data;
	}
}
public class Stackc {
	

	
	

}
