package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph07_Dfs_Find_Cycle_Directed_Graph {
	
public static boolean iscycle(ArrayList<ArrayList<Integer>> adj,int v) {
	int vis[]=new int[v+1];
	int second_vis[]=new int[v+1];
	
	for(int i=1;i<=v;i++) {
		if(vis[i]==0) {
			if(check_dfs_cycle(i,adj,vis,second_vis)==true) {
				return true;
			}
		}
	}
			return false;
}
private static boolean check_dfs_cycle(int node, ArrayList<ArrayList<Integer>> adj, int vis[],int s_vis[]) {
	vis[node]=1;
	s_vis[node]=1;
	
	for(Integer it: adj.get(node) ) {
		if(vis[it]==0) {
			if(check_dfs_cycle(it, adj, vis, s_vis)==true) {
				return true;
			}
		}else if(s_vis[it]==1) {
			return true;
		}
	}
//	System.out.println(s_vis[node]);
	s_vis[node]=0;
	
	return false;
}
public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
		adj.get(sourse).add(dest);
		
		
}
public static void main(String args[]) {
	int v=3;
	int e=3;
//	1 2
//	2 3
//	3 4 
//	3 6
//	4 5
//	6 5
//	7 2
//	7 8
//	8 9
//	9 7
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
		System.out.println("Yes cycle");
	}else {
		System.out.println("No cycle");
	}
}
}
