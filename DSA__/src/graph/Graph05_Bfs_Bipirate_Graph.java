package graph;

import java.util.*;
public class Graph05_Bfs_Bipirate_Graph {
	
	
 static boolean bfscheck(int node,ArrayList<ArrayList<Integer>> adj,int colour[]) {
   Queue<Integer> q=new LinkedList<>();
   q.add(node);
   colour[node]=1;
   
   while(!q.isEmpty()) {
	  Integer  nde= q.poll();
	   
	   for(Integer it:adj.get(nde)) {
		   if(colour[it]==-1) {
			   colour[it]=1-colour[nde];
			   q.add(it);
		   }else if(colour[it]==colour[nde]) {
			   return false;
		   }
	   }
	   
   }
   return true;
}

 static boolean check_colour(ArrayList<ArrayList<Integer>> adj,int v) {
	
	int  colour[]=new int[v+1];
	for(int i=0;i<v;i++) {
		colour[i]=-1;
	}
	for(int i=0;i<=v;i++) {
		if(colour[i]==-1) {
			if(!bfscheck(i,adj, colour)) {
				return false;
			}
		}
	}
	return true;
}
public static void addedgege( ArrayList<ArrayList<Integer>> adj,int sourse,int dest) {
		adj.get(sourse).add(dest);
		adj.get(dest).add(sourse);
		
	}
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the vertices and edeges:");
	int v=sc.nextInt();
	int e=sc.nextInt();
	ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
	
	for(int i=0;i<v;i++) {
		adj.add(new ArrayList<Integer>());
	}
	
	//bipartite..
//	1 2
//	2 3
//	2 8
//	3 4
//	8 5
//	4 5
//	5 6
//	6 7
	
	//Not bipartite
//	1 2
//	2 3
//	2 7 
//	7 6
//	3 4
//	6 5
//	4 5
//	5 8
	for(int i=1;i<e;i++) {
		int sourse=sc.nextInt();
		int destination=sc.nextInt();
		addedgege(adj,sourse,destination);
	}
	
	if(Graph05_Bfs_Bipirate_Graph.check_colour(adj, v)==true) {
		System.out.println("Not Bipirite!!");
	}else {
		System.out.println("Yes Bipirite!! ");
	}
}
}
