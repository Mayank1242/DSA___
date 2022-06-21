//package graph;
//import java.util.ArrayList;
//import java.util.Scanner;
//class Node 
//{
//    private int v;
//    private int weight;
//    
//    Node(int _v, int _w) { v = _v; weight = _w; }
//    
//    Node() {}
//    
//    int getV() { return v; }
//    int getWeight() { return weight; }
//}
//
//public class Graph14_Prims_Algo_For_Mst {
//
//    
//public static void prims_algo(ArrayList<ArrayList<Node>> adj,int v,int src) {
//	int weight[]=new int[v];
//	int parent[]=new int[v];
//	boolean vis[]=new boolean[v];
//	
//	for(int i=0;i<v;i++) {
//		weight[i]=Integer.MAX_VALUE;
//		
//		vis[i]=false;
//		
//	}
//   weight[src]=0;
//   parent[src]=-1;
//	
//   for(int i=0;i<v-1;i++) {
//	   int mini=Integer.MAX_VALUE,u=0;
//	   
//	   for(int j=0;j<v;j++) {
//		   if(vis[j]==false && weight[j]<mini) {
//			   mini=weight[j];
//			   u=j;
//		   }
//	   }
//	   
//	   vis[u]=true;
//	   for(Node it:adj.get(u)) {
//		   if(vis[it.getV()]==false && weight[it.getV()]>it.getWeight()) {
//			   parent[it.getV()]=u;
//			   weight[it.getV()]=it.getWeight();
//		   }
//	   }
//   }
//   
//   for(int i=1;i<v;i++) {
//	   System.out.println(parent[i] +" "+i);
//   }
//	
//}
//public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
//		adj.get(sourse).add(dest);
//}
//public static void main(String args[]) {
//		int v=5;
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
////		adj.get(0).add(new Node(1, 5));
////		adj.get(0).add(new Node(2, 5));
////		adj.get(0).add(new Node(3, 6));
////		
////		adj.get(1).add(new Node(4, 1));
////		
////		adj.get(2).add(new Node(1, 2));
////		adj.get(2).add(new Node(4, 2));
////		
////		adj.get(4).add(new Node(6, 3));
////		adj.get(3).add(new Node(5, 1));
////		
////		adj.get(3).add(new Node(2, 2));
////		adj.get(3).add(new Node(5, 1));
////		
////		adj.get(5).add(new Node(6, 4));
//		adj.get(0).add(new Node(1, 2));
//		adj.get(1).add(new Node(0, 2));
//		
//		adj.get(1).add(new Node(2, 3));
//		adj.get(2).add(new Node(1, 3));
//		
//		adj.get(0).add(new Node(3, 6));
//		adj.get(3).add(new Node(0, 6));
//		
//		adj.get(1).add(new Node(3, 8));
//		adj.get(3).add(new Node(1, 8));
//		
//		adj.get(1).add(new Node(4, 5));
//		adj.get(4).add(new Node(1, 5));
//		
//		adj.get(2).add(new Node(4, 7));
//		adj.get(4).add(new Node(2, 7));
//		
//		
//		prims_algo(adj, v, 0);
////		prims(0, adj, v);
//	}
//}
