package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph06_Dfs_Bipartite {
	
public static boolean check_Bipartie(int node, ArrayList<ArrayList<Integer>> adj,int colour[]) {
	
	if(colour[node]==-1) {
		colour[node]=1;

	}
	
	for(Integer it:adj.get(node)) {
		if(colour[it]==-1) {
			colour[it]=1-colour[node];
			if(check_Bipartie(it, adj, colour)) {
				return true;
			}
		}else if(colour[it]!=colour[node]) {
			return true;
		}
	}
	
	
	
	
	return false;
}

public static boolean check_colour(ArrayList<ArrayList<Integer>> adj,int v) {
	int colour[]=new int[v+1];
	for(int i=0;i<v;i++) {
		colour[i]=-1;
	}
	for(int i=0;i<=v;i++) {
		if(colour[i]==-1) {
			if(!check_Bipartie(i,adj,colour)) {
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
//	1 2
//	2 3
//	2 7 
//	7 6
//	3 4
//	6 5
//	4 5
//	5 8
		int v=3;
		int e=3;
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=1;i<=v+1;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		
		for(int i=1;i<e;i++) {
			int sourse=sc.nextInt();
			int destination=sc.nextInt();
			addedgege(adj,sourse,destination);
	    }

		
		if(check_colour(adj, v)) {
			System.out.println("Yes bipirate");
		}else {
			System.out.println("No bipirate");
		}
		
}
}
