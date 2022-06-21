package graph;
//import java.lang.reflect.Array;
import java.util.*;
public class Graph02_Dfs1_Traversal_Recursive {
public static void Dfs_recursive(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> store) {
	store.add(node);
	vis[node]=true;
//	System.out.println(store);
	for(Integer it:adj.get(node)) {
		if(vis[it]==false) {
			Dfs_recursive(it, vis, adj, store);
		}
	}
	
}
public static ArrayList<Integer> dfs(int v,ArrayList<ArrayList<Integer>> adj) {
	ArrayList<Integer> store=new ArrayList<>();
	boolean vis[]=new boolean[v+1];
	
	for(int i=0;i<v;i++) {
		if(vis[i]==false) {
		Dfs_recursive(i,vis,adj,store);
		}
	}
//	System.out.println(store);
	return store;
}
	
	
	public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
		adj.get(sourse).add(dest);
		adj.get(dest).add(sourse);
		
	}
	public static void main(String args[]) {
//		1 2
//		2 3
//		3 7
//		2 7
//		7 5
//		4 6
		int v=4;
		int e=4;
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		
		for(int i=0;i<e;i++) {
			int sourse=sc.nextInt();
			int destination=sc.nextInt();
			addedgege(adj,sourse,destination);
		}
		
	   System.out.println(dfs(v,adj));
	}
}
