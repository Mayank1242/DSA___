package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph04_Dfs_Find_Cycle {

public static boolean check_Cycle(int node,int parent,ArrayList<ArrayList<Integer>> adj, boolean vis[]) {
		vis[node]=true;
	    
		for(int it:adj.get(node)) {
			if(vis[it]==false) {
				check_Cycle(it,node, adj, vis);
				
			}else if(parent!=it) {
				return true;
			}
		}
	
		return false;
	}

public static boolean iscycle( ArrayList<ArrayList<Integer>> adj,int v) {
	boolean vis[]=new boolean[v+1];
	for(int i=0;i<=v;i++) {
		if(vis[i]==false) {
			if(check_Cycle(i,-1,adj,vis)) {
				return true;
			}
		}
	}
	return false;
}

public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
		adj.get(sourse).add(dest);
		adj.get(dest).add(sourse);
		
}
public static void main(String args[]) {
		int v=5;
		int e=7;
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=1;i<=v+1;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		
		for(int i=0;i<e;i++) {
			int sourse=sc.nextInt();
			int destination=sc.nextInt();
			addedgege(adj,sourse,destination);
	    }
		
		if(iscycle(adj, v)) {
			System.out.println("Cycle present");
		}else {
			System.out.println("Cycle not present");
		}
}
}
