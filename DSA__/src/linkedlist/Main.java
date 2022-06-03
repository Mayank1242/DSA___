package linkedlist;

public class Main {
	public static void main(String args[]) {
		LL list=new LL();
		list.addFirst(10);
		list.addFirst(10);
		list.addFirst(12);
		list.addFirst(12);
//		list.addLast("Mishra");
		
//		
////		System.out.println(list.removeFirst() + ": From First Deleted!!");
////		System.out.println(list.removeFirst() + ": From First Deleted!!!");
////	
////        System.out.println(list.removeLast() + ": From last Deleted!!!");
//		list.add("not", 0);
//		list.insertrecurstion("mayank", 2);
		list.Printlist();
//		list.removeduplicates();
//		
		System.out.println(list.hasCycle());
		System.out.println("Length of cycle is : " + list.countCycle());
//		list.Printlist();
		LL list2=new LL();
		list2.addFirst(10);
		list2.addFirst(10);
		list2.addFirst(12);
		list2.addFirst(12);
		
//		ans.merge(list,list2);
		
		
//		
//		 System.out.println(list.remove(2) + ": From index deleted!!!");
//		
//		list.Printlist();
//		String data="Mayank";
//		if(list.find(data)!=null) {
//			System.out.println("find element");
//		}else {
//			System.out.println("Not found");
//		}
//		
//		list.Count_size();
		
//		DLL list =new DLL();
//		list.addFirst(10);
//		list.addFirst(12);
//		list.addLast(112);
//		list.add(10000, 1);
//		list.printList();
	}
}
