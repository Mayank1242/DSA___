package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Shortest path in unidirectional graph with unit weight.........
public class Graph11_Sortest_Path_Undirected_With_Unit_Weight {
	
public static void Shortest(ArrayList<ArrayList<Integer>> adj,int v,int src) {
	int dis[]=new int[v+1];
	for(int i=0;i<v;i++) {
		dis[i]=Integer.MAX_VALUE;
		
	}
	
	
	
	Queue<Integer> q=new LinkedList<Integer>();
	q.add(src);
	dis[src]=0;
	
	while(q.isEmpty()==false) {
		int node=q.poll();
		
		for(int it:adj.get(node)) {
			if(dis[node]+1<dis[it]) {
				dis[it]=dis[node]+1;
				q.add(it);
			}
		}
	}
	
	for(int i=0;i<v;i++) {
		System.out.println("0 "+" to "+i+" "+dis[i]);
	}
}
	
public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
		adj.get(sourse).add(dest);
		adj.get(dest).add(sourse);
}
public static void main(String args[]) {
		int v=7;
//		int e=3;

		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
//		0 1
//		0 2
//		0 3
//		1 4
//		2 1
//		2 4
//		4 6
//		3 5
//		3 2
//		3 5
//		5 6
		adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(0).add(3);
		
		adj.get(1).add(4);
		
		adj.get(2).add(1);
		adj.get(2).add(4);
		
		adj.get(4).add(6);
		adj.get(3).add(5);
		
		adj.get(3).add(2);
		adj.get(3).add(5);
		
		adj.get(5).add(6);
//		for(int i=0;i<e;i++) {
//			int sourse=sc.nextInt();
////			System.out.println("as");
//			int destination=sc.nextInt();
//			addedgege(adj,sourse,destination);
//	    }
		
		
		Shortest(adj, v, 0);
	}
}
