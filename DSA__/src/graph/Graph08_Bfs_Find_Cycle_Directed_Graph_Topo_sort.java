package graph;

import java.lang.reflect.Array;
import java.util.*;

public class Graph08_Bfs_Find_Cycle_Directed_Graph_Topo_sort {
	
public static boolean toposort(ArrayList<ArrayList<Integer>> adj,int v){
	ArrayList<Integer> topo=new ArrayList<>(v+1);
	int indegree[]=new int[v+1];
	for(int i=0;i<v;i++) {
		for(int it:adj.get(i)) {
			indegree[it]++;
		}
	}
	
	Queue<Integer > q=new LinkedList<>();
	
	
	for(int i=0;i<v;i++) {
		if(indegree[i]==0) {
			q.add(i);
		}
	}
	int count=0;
	while(!q.isEmpty()) {
		int node=q.poll();
		count++;
		topo.add(node);
		
		for(int it:adj.get(node)) {
			indegree[it]--;
			if(indegree[it]==0) {
				q.add(it);
			}
		}
	}
	
	if(count==v) {
		return false;
	}else {
		return true;
	}
	
	
	
	
	
}
public static void addegdege(ArrayList<ArrayList<Integer>> adj,int u,int v) {
	adj.get(u).add(v);
}
public static void main(String args[] ){
	ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
	
	int v=4;
	int e=4;
	for(int i=0;i<=e;i++) {
		adj.add(new ArrayList<>());
	}
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<v;i++) {
		int s=sc.nextInt();
		int d=sc.nextInt();
		
		addegdege(adj, s, d);
	}
	
//	System.out.println(toposort(adj, v));
	
	if(toposort(adj, v)) {
		System.out.println("Cycle avalible");
	}else {
		System.out.println("Cycle not found");
	}
}
}
