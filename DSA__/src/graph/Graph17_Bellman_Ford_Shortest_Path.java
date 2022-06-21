//package graph;
//import java.util.*;
//class Node{
//	int v;
//	int weight;
//	
//	Node(int vi,int w){
//		v=vi;
//		weight=w;
//	}
//	Node(){
//		
//	}
//	
//	int getv() {
//		return v;
//		
//	}
//	int getw(){
//		return weight;
//	}
//}
//
//public class Graph17_Bellman_Ford_Shortest_Path {
//public static void bellmenford(ArrayList<Node> adj,int n,int s) {
//	int dest[]=new int[n];
//	for(int i=0;i<n;i++) {
//		dest[i]=Integer.MAX_VALUE;
//		
//	}
//	dest[s]=0;
//	
//	for(int i=0;i<n-1;i++) {
//		for(Node node:adj) {
//			if(dest[node.getw()]+node.getw()<dest[node.getv()]) {
//				dest[node.getv()]=dest[node.getw()]+node.getw();
//			}
//		}
//	}
//	
//	int f=0;
//	for(Node node:adj) {
//		if(dest[node.getw()]+node.getw()<dest[node.getv()]) {
//			dest[node.getv()]=dest[node.getw()]+node.getw();
//		}
//	}
//	
//	if(f==0) {
//		System.out.println("Shortest path from " +s+" to destination is "+ dest[5] );
//	}
//	
//}
//public static void addedege(ArrayList<Node> adj,int v,int u,int w){
//    ((List<Node>) adj.get(v)).add(new Node(u,w));
////    adj.get(u).add(new Node(v,w));
//}
//public static void main(String args[]) {
//	int e=7;
//    int v=5;
//	Scanner sc=new Scanner(System.in);
//	ArrayList<Node> adj=new ArrayList<>();
//	
//	
//	
//	for(int i=0;i<e;i++){
//	    int a=sc.nextInt();
//	    int b=sc.nextInt();
//	    int weight=sc.nextInt();
//	    
//	    addedege(adj,a,b,weight);
//	    
//	}
//	bellmenford(adj, e, v);
//}
//}
