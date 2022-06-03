//package graph;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//class Node{
//	 int first;
//	 int second;
//	
//	
//
//	public  Node(int first,int second){
//		this.first=first;
//		this.second=second;
//	}
//}
//
//public class Graph03_Bfs_find_cycle {
//	
//public static boolean checkcycle(ArrayList<ArrayList<Integer>> adj,int s,boolean vis[]) {
//	Queue<Node> q=new LinkedList<>();
//
////Node obj=new Node(s,-1);
//	q.add(new Node(s,-1));
//	vis[s]=true;
//	while(!q.isEmpty()) {
//		int node=q.peek().first;
//		int prev=q.peek().second;
//		q.remove();
//		
//		for(int it:adj.get(node)) {
//			if(vis[it]==false) {
//				q.add(new Node(it, node));
//				vis[it]=true;
//			}else if(prev!=it) {
//				return true;
//			}
//		}
//	}
//	
//	
//	
//	
//	return false;
//}
//	
//public static boolean iscycle(int v,ArrayList<ArrayList<Integer>> adj) {
//	boolean vis[]=new boolean[v+1];
//	for(int i=1;i<=v;i++) {
//		if(vis[i]==false) {
//			if(checkcycle(adj,i,vis)) {
//				return true;
//			}
//		}
//	}
//	
//	
//	return false;
//}
//
//public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
//	adj.get(sourse).add(dest);
//	adj.get(dest).add(sourse);
//	
//}
//public static void main(String args[]) {
//	int v=3;
//	int e=3;
//	Scanner sc=new Scanner(System.in);
//	ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
//	
//	for(int i=1;i<=v+1;i++) {
//		adj.add(new ArrayList<Integer>());
//	}
//	
//	
//	for(int i=0;i<e;i++) {
//		int sourse=sc.nextInt();
//		int destination=sc.nextInt();
//		addedgege(adj,sourse,destination);
//	}
//	
//	if(iscycle(v, adj)) {
//		System.out.println("cycle present!");
//	}else {
//		System.out.println("Not present!");
//	}
//	
//	
//	
//}
//}
