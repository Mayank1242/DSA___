package graph;
import java.util.*;



public class Trial {
	


public static void addedege(ArrayList<ArrayList<Integer>> adj, int sourse,int dest) {
	adj.get(sourse).add(dest);
	adj.get(dest).add(sourse);
}
	
	
public static void main(String args[]) {
//Scanner sc=new Scanner(System.in);
//System.out.println("enter the no of vertex and no of edges");
//int v=sc.nextInt();
//int e=sc.nextInt();
//
////Making adjecny list to represent the graph
//ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
//
//
//for(int i=0;i<=v;i++) {
//	adj.add(new ArrayList<Integer>());
//}
//System.out.println("conect edeges");
//for(int i=0;i<e;i++) {
//	int s=sc.nextInt();
//	int d=sc.nextInt();
//	
//	addedege(adj, s, d);
//	
//}
//
//System.out.println(adj);	
//	
////System.out.println(bfs(adj, v));
////System.out.println(Dfs(adj, v));
//
////if(isCycle(adj, v)) {
////	System.out.println("Cycle hai!!");
////}else {
////	System.out.println("Cycle Nhi hai!!!");
////}
//	Scanner sc=new Scanner(System.in);
////	
////	int n=sc.nextInt();
//	int x=sc.nextInt();
// 	int y=sc.nextInt();
// 	
// 	int count=0;
// 	
// 	while(x!=y){
// 	    if(x<y){
// 	        count++;
// 	        x+=1;
// 	    }else if(x>y){
// 	        count++;
// 	        y+=2;
// 	    }
// 	}
//
//System.out.println(count);
	
	 Queue<Integer> q=new LinkedList<Integer>();
	 q.add(10);
	 q.add(20);
	 q.add(30);
	 q.add(40);
	 q.add(50);
	 
	 System.out.println(q);
	 System.out.println(q.remove());
	 System.out.println(q);
	 System.out.println(q.poll());
	 System.out.println(q);
	 System.out.println(q.poll());
}	
}
