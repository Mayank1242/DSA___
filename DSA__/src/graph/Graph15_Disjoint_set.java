package graph;

public class Graph15_Disjoint_set {
//Disjoint set it is used in kurskuls algo 
//it is used to checkmif there are too much compoent so the are from same or not..
//it provude to opertaion find parent operation and union operation.
/*
 
example-->
	if they are component like 1 2 3 4 5 6 7 they are all 7 different component.
	
	they are look like-
	1   2  3
	4   5  6
	all are its parent.means 1's parent is 1. and 2's parent is 2.
	
	for do union of that it->
--------------------------------------------------------------------
	union(1,2)- 
	(1  2) 3
     4  5  6 7
     find parent of 2 is now 1...
     
     union(2,3)-
     (1  2 3)
     4  5  6 7
     so parent of 3 is now 1..
 	
 	union(4,5)-
     (1  2 3)
     (4  5)  6 7
     so parent of 5 is now 4..
     
     union(6,7)-
     (1  2 3)
     (4  5) (6 7)
     so parent of 6 is now 7..
     
          union(5,6)-
     (1  2 3)
     (4  5 6 7)
     so parent of  7 is now 4..
 ---------------------------------------------------------------------
 for check they are belong from the same graph or not -Check there parent.
 
  efficient implementation of disjoint set is by path compression and union by rank.   
  
 --------------------------------------------------------------------------
 
 1- we have a parent array and every node is himself its  parent array.
 2-we make a rank array who maintain the rank of node.all are ashgin as 0.
 
 
     
*/	
	
  public static void makeset(int v,int parent[],int rank[]) {
	  for(int i=1;i<=v;i++) {
		 parent[i]=i;
		 rank[i]=0;
	  }
  }
  
  public static int findparent(int node,int parent[],int rank[]) {
	  if(node==parent[node]) {
		  return node;
	  }
	  
	  return parent[node]=findparent(node, parent, rank);
  }
  
  void union(int u,int v,int parent[],int rank[]) {
	  u=findparent(u, null, null);
	  v=findparent(v, null, null);
	  if(rank[u]<rank[v]) {
		  parent[u]=v;
	  }else if(rank[v]<rank[u]) {
		  parent[v]=u;
	  }else {
		  parent[v]=u;
		  rank[u]++;
	  }
			  
  }
	
	public static void main(String args[]) {
		int parent[]=new int[1000];
		int v=5;
		int rank[]=new int[5]; 
		
		makeset(v,parent,rank);
	}
}
