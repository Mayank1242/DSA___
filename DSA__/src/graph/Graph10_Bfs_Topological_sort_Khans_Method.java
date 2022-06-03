package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph10_Bfs_Topological_sort_Khans_Method {

	
	public static ArrayList<Integer> topo_sort(int v,ArrayList<ArrayList<Integer>> adj) {
		 ArrayList<Integer> topo=new ArrayList<>(v);
		int indegree[]=new int[v+1];
		for(int i=1;i<=v;i++) {
			for(Integer it:adj.get(i)) {
				indegree[it]++;
			}
		}
		
		Queue<Integer> q=new LinkedList<>();
	    for(int i=0;i<v;i++) {
	    	if(indegree[i]==0) {
	    		q.add(i);
	    	}
	    }
		
		
	    while(!q.isEmpty()) {
	    	Integer node =q.poll();
	    	topo.add(node);
	    	
	    	for(int it:adj.get(node)) {
	    		indegree[it]--;
	    		if(indegree[it]==0) {
	    			q.add(it);
	    		}
	    	}
	    }
		return topo;
	}	
	
public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
		adj.get(sourse).add(dest);
}
public static void main(String args[]) {
		int v=6;
		int e=6;

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
		
		System.out.println(topo_sort(v, adj));
		
	}
}
