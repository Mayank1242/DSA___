package linkedlist;

import java.util.*;

import linkedlist.LL.node;

public class LL {
	  private node head;
	  private int size;
	 class node{
        int data;
		node next;
		
		node(int data){
			this.data=data;
			this.next=null;
		}
		node(int data,node next){
			this.data=data;
			this.next=next;
		}
	} 

public void addFirst(int data) {
node newnode=new node(data);

size++;
if(head==null) {
	head=newnode;
  return;
}

newnode.next=head;
head=newnode ;

}

public void addLast(int data) {
	node newnode=new node(data);
	
	size++;
	if(head==null) {
		head=newnode;
		return;
	}
	
	node currentnode=head;
	while(currentnode.next!=null) {
		currentnode=currentnode.next;
	}
	currentnode.next=newnode;
	
}
//insert using recusrion

public void insertrecurstion(int dats,int index) {
	head=insertrecurseion(dats, index, head);
}
private node insertrecurseion(int data,int indx,node newnode) {
	
	
	
	if(indx==0) {
		node temp=new node(data,newnode);

		size++;
		return temp;
		
	}

	
	newnode.next=insertrecurseion(data, indx--,newnode.next);
	return newnode;
}

public void removeduplicates() {
	node newnode =head;
	if(newnode==null) {
		return;
	}
	while(newnode.next!=null) {
		if(newnode.data==newnode.next.data) {
			newnode.next=newnode.next.next;
			size--;
		}else {
		newnode=newnode.next;
		}
	}
	
	
}
public void removeduplicates2() {
	
}
//public static LL merge(LL l1,LL l2) {
//	node f=l1.head;
//	node s=l2.head;
//	
//	LL ans =new LL();
//	while(f!=null && s!=null) {
//		if(f.data < s.data) {
//			ans.addLast(f.data);
//			
//			s=s.next;
//		}else {
//			ans.addLast(s.data);
//			s=s.next;
//		}
//	}
//}
public boolean hasCycle() {
    node fast=head;
    node slow=head;
    
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
        return true;

        }
    }
    
    return false;
}
public int countCycle() {
    node fast=head;
    node slow=head;
    
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
        	node temp=slow;
        	int length=0;
          do {
        	  temp=temp.next;
        	  length++;
        	  
          }while(fast==temp);
           return length;
        }
    }
    
    return 0;
}
public void add(int data,int indx) {
	
	
	node currentnode =head;
	
	if(indx==0) {
		addFirst(data);
		return;
	}
	if(indx==size) {
		addLast(data);
	}
	for(int i=1;i<indx;i++) {
	  currentnode=currentnode.next;
	}
	 
	node newnode=new node(data,currentnode.next);
	currentnode.next=newnode;
	
	
}
public int removeFirst() {
	if(head==null) {
		System.out.println("It is empty!! ");
	}
	size--;
	int temp=head.data;
	head=head.next;
	return temp;
	
}

public int removeLast() {
	if(head==null) {
		System.out.println("It is empty!! ");
	}
	
	size--;
	node secondlast=head;
	node lastnode =head.next;
	int temp=lastnode.data;
	while(lastnode.next!=null) {
		lastnode=lastnode.next;
		secondlast=secondlast.next;
	}
	secondlast.next=null;
	return temp;
}

public int remove(int indx) {
	if(indx==0) {
		removeFirst();
	}
	if(indx==size-1) {
		removeLast();
	}
	
	node prev=get(indx-1);
	int val=prev.next.data;
	prev.next=prev.next.next;

	return val;
}
public node get(int indx) {
	node newnode =head;
	for(int i=0;i<indx;i++) {
		newnode=newnode.next;
	}
	return newnode;
}

public node find(int find) {
	node newnode =head;
	while(newnode!=null) {
		if(newnode.data==find) {
			
			return newnode;
		}
		
		newnode=newnode.next;
	}
	return null;
}
public void Printlist() {
	if(head==null) {
		System.out.println("List is Empty");
	}
	node cuurentnode=head;
	while(cuurentnode!=null) {
		System.out.print(cuurentnode.data +"->");
		cuurentnode=cuurentnode.next;
	}
	System.out.println("NULL");
}

public void Count_size() {
	System.out.println(size);
}
}
 