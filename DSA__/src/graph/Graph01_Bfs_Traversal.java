package graph;
import java.lang.reflect.Array;
import java.util.*;
public class Graph01_Bfs_Traversal {
//   private LinkedList<Integer> adj[];
   private static ArrayList<Integer> bfstraversal(int v,ArrayList<ArrayList<Integer>> adj ) {
	ArrayList<Integer> bfs=new ArrayList<>();
	boolean vis[]=new boolean[v+1];
	
	for(int i=1;i<=v;i++) {
		
		if(vis[i]==false) {
			Queue<Integer> q=new LinkedList<>();
			q.add(i);
			vis[i]=true;
			
			while(!q.isEmpty()) {
				int node =q.poll();
				bfs.add(node);
//				System.out.println("adj.get(node):" + adj.get(node));
				for(int it: adj.get(node)) {
					System.out.println("It =" +it);
					if(vis[it]==false) {
						vis[it]=true;
						System.out.println(it +" IT visited: ");
						q.add(it);
					}
				}
			}
		}
	  }
	   
	return bfs;   
   }
   
   public static void addedege(ArrayList<ArrayList<Integer>> adj,int  sourse,int destination) {
	   adj.get(sourse).add(destination);
	   adj.get(destination).add(sourse);
   }
   
	
	public static void main (String[] args) 
	{
//		1 2
//		2 3
//		3 7
//		2 7
//		7 5
//		4 6
		int v=5;
		int e=5;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		
	
		System.out.println("sds");
		for(int i=0;i<e;i++) {
			int sourse=sc.nextInt();
			int destination=sc.nextInt();
			
			addedege(adj, sourse, destination);
		}
		
		System.out.println("Your adjency List is "+adj);
//		adj.get(1).add(2);
//		adj.get(2).add(1);
//		adj.get(2).add(3);
//		adj.get(2).add(7);
//		
//		adj.get(3).add(2);
//		adj.get(3).add(5);
//		
//		adj.get(4).add(6);
//		
//		adj.get(5).add(7);
//		adj.get(5).add(3);
//		
//		adj.get(6).add(4);
//		
//		adj.get(7).add(2);
//		adj.get(7).add(5);
//		bfstraversal(v,adj);
		ArrayList<Integer> ans=new ArrayList<>();
		ans=bfstraversal(v,adj);
		
		System.out.println(ans);
//		boolean isreached=bfs(adj,1,3,v,pred,dist);
//		System.out.println(isreached);
		
   }
}
