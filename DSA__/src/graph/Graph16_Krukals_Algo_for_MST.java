package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class pair{
	int u;
	int v;
	int weight;
	
	
	pair(int u,int v,int weight){
		this.v=v;
		this.u=u;
		this.weight=weight;
	}
	int getv() {
		return v;
	}
	int getu() {
		return u;
	}
	int getw() {
		return weight;
	}
}
class Sortcomprator implements Comparator<pair>{
	
	@Override
	public int compare(pair o1, pair o2) {
	if(o1.getw()<o2.getw()) {
		return -1;
	}
	if(o1.getw()<o2.getw()) {
		return 1;
	}
	
	return 0;
}
}

public class Graph16_Krukals_Algo_for_MST {
public static int findPar(int u,int parent[]) {
		  if(u==parent[u]) return u;
			return parent[u] = findPar(parent[u], parent); 
}
	  
public static void union(int u, int v, int parent[], int rank[]) {
			u = findPar(u, parent); 
			v = findPar(v, parent);
			if(rank[u] < rank[v]) {
	        	parent[u] = v;
	        }
	        else if(rank[v] < rank[u]) {
	        	parent[v] = u; 
	        }
	        else {
	        	parent[v] = u;
	        	rank[u]++; 
	        }
		}
public static void kurskals(ArrayList<pair> adj,int v) {
	Collections.sort(adj, new Sortcomprator());
	int parent[]=new int[v];
	
	int rank[]=new int[v]; 
	
	 for(int i=0;i<v;i++) {
		 parent[i]=i;
		 rank[i]=0;
	  }
	 
	 int costMst=0;
	 
	 ArrayList<pair> mst=new ArrayList<>();
	 for(pair it:adj) {
		 if(findPar(it.getu(), parent)!= findPar(it.getv(), parent)) {
			 costMst += it.getw(); 
     		mst.add(it); 
     		union(it.getu(), it.getv(), parent, rank);
		 }
	 }
	 
	 System.out.println(costMst);
     for(pair it: mst) {
     	System.out.println(it.getu() + " - " +it.getv()); 
     }
}
public static void main(String args[]) {
	int n = 5;
    ArrayList<pair> adj = new ArrayList<pair>();
	
		
	adj.add(new pair(0, 1, 2));
	adj.add(new pair(0, 3, 6));
	adj.add(new pair(1, 3, 8));
	adj.add(new pair(1, 2, 3));
	adj.add(new pair(1, 4, 5));
	adj.add(new pair(2, 4, 7));
	
	kurskals(adj, n);
}
	
}
