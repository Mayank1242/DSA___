package graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Graph09_Dfs_Topological_sort_ {
	
	
public static void topo_sort(int node,ArrayList<ArrayList<Integer>> adj,int vis[],Stack<Integer> S) {
	
	vis[node]=1;
	
	for(int it:adj.get(node)) {
		if(vis[it]==0) {
			topo_sort(it, adj, vis, S);
			
		}
	}
	S.push(node);
}

//for zero base indexing for that make your for loop starts from 0....
//5 2
//5 0
//4 0
//5 2
//2 3
//3 1

//for one base indexing for that make your for loop starts from 1  ....
//6 3
//6 1
//5 1
//6 3
//3 4
//4 2
public static ArrayList<Integer> Dfs_sort(ArrayList<ArrayList<Integer>> adj,int v) {
	Stack<Integer> S=new Stack<>();
	int vis[]=new int[v+1];
for(int i=0;i<v;i++) {
	if(vis[i]==0){
	   topo_sort(i,adj, vis,S);
	}
}


ArrayList<Integer> topo=new ArrayList<>(v);

while(!S.isEmpty()) {
	
	topo.add(S.pop());
}
return topo;
	
}
//5 2
//5 0
//4 0
//4 1
//2 3
//3 1
public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
		adj.get(sourse).add(dest);
}
public static void main(String args[]) {
		int v=3;
		int e=3;

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
		
		System.out.println(Dfs_sort(adj, v));
		
	}
	
}
