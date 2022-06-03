//package graph;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//class Node implements Comparator<Node>{
//private int v;
//private int weight;
//
//Node(int v,int weight){
//	this.v=v;
//	this.weight=weight;
//}
//Node(){
//	
//}
//public int getv() {
//	return v;
//}
//public int getweight() {
//	return weight;
//}
//@Override
//	
//	public int compare(Node o1, Node o2) {
//		if(o1.weight<o2.weight) {
//			return -1;
//			
//		}
//		if(o1.weight>o2.weight) {
//			return 1;
//		}
//		
//		return 0;
//	}
//	
//}
//public class Graph13_Dijkstras_Algorithm_Shortest_path {
//public static void Shortest_path(int s,ArrayList<ArrayList<Node>> adj,int n ) {
//	int dist[]=new int[n];
//	for(int i=0;i<n;i++) {
//		dist[i]=Integer.MAX_VALUE;
//		dist[s]=0;
//	}
//	
//	PriorityQueue<Node> q=new PriorityQueue<Node>(n,new Node());
//	q.add(new Node(s,0));
//	
//	while(q.size()>0) {
//		Node node=q.poll();
//		
//		for(Node it:adj.get(node.getv())) {
//			if(dist[node.getv()]+it.getweight()<dist[it.getv()]) {
//				dist[it.getv()]=dist[node.getv()]+it.getweight();
//				q.add(new Node(it.getv(),dist[it.getv()]));
//			}
//		}
//	}
//	for(int i=0;i<n;i++) {
//		System.out.println("0 "+" to "+i+" "+dist[i]);
//	}
////	System.out.println("Shortest path from 0 to destination is "+ dist[6] );
//}
//	
//public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
//		adj.get(sourse).add(dest);
//}
//public static void main(String args[]) {
//		int v=7;
////		int e=6;
//
//		Scanner sc=new Scanner(System.in);
//		ArrayList<ArrayList<Node>> adj=new ArrayList<>();
//		
//		for(int i=0;i<=v;i++) {
//			adj.add(new ArrayList<Node>());
//		}
//		
////		
////		for(int i=0;i<e;i++) {
////			int sourse=sc.nextInt();
////			int destination=sc.nextInt();
////			addedgege(adj,sourse,destination);
////	    }
//		
////		0 1
////		0 2
////		0 3
////		1 4
////		2 1
////		2 4
////		4 6
////		3 5
////		3 2
////		3 5
////		5 6
//		adj.get(0).add(new Node(1, 5));
//		adj.get(0).add(new Node(2, 5));
//		adj.get(0).add(new Node(3, 6));
//		
//		adj.get(1).add(new Node(4, 1));
//		
//		adj.get(2).add(new Node(1, 2));
//		adj.get(2).add(new Node(4, 2));
//		
//		adj.get(4).add(new Node(6, 3));
//		adj.get(3).add(new Node(5, 1));
//		
//		adj.get(3).add(new Node(2, 2));
//		adj.get(3).add(new Node(5, 1));
//		
//		adj.get(5).add(new Node(6, 4));
////		adj.get(4).add(new Node(1, 5));
////		
////		adj.get(2).add(new Node(4, 1));
////		adj.get(4).add(new Node(2, 1));
//		
//		Shortest_path(0, adj, v);
//		
//	}
//}
