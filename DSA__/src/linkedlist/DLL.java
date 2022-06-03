package linkedlist;

import linkedlist.LL.node;

public class DLL {
      private node head;
      private int size;
	class node{
		int data;
		node next;
		node prev;
		node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		node(int data,node next,node prev){
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	}
	public void addFirst(int data) {
		node newnode=new node(data);
		newnode.next=head;
		newnode.prev=null;
		size++;
		if(head!=null) {
			head.prev=newnode;
		}
		head=newnode;
		
		
		
	}
	
	public void addLast(int data) {
		node newnode=new node(data);
		
		size++;
		if(head==null) {
			newnode.prev=null;
			head=newnode;
			return;
		}
		
		node currentnode=head;
		while(currentnode.next!=null) {
			currentnode=currentnode.next;
		}
		currentnode.next=newnode;
		newnode.prev=currentnode;
	}
	
	public void add(int data,int index) {
		
		size++;
		node temp=head;
		if(index==0) {
			addFirst(data);
		}
		if(index==size-1) {
			addLast(data);
		}
		
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		node newenode=new node(data,temp.next,temp.prev);
		temp.next=newenode;
		newenode.prev=temp;
				
	}
	public node get(int index) {
		node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		
		return temp;
	}
	public void printList() {
		node temp=head;
		node last=null;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			last=temp;
			temp=temp.next;
		}
		System.out.print("NULL");
		
		System.out.println("\nafter reverse");
		while(last!=null) {
			System.out.print(last.data + "->");
			last=last.prev;
		}
		System.out.println("Start");
	}
	
}
