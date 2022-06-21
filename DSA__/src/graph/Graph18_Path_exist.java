package graph;
import java.lang.reflect.Array;
import java.util.*;

public class Graph18_Path_exist {

	public static boolean ispath(ArrayList<ArrayList<Integer>> adj,int sourse,int dest,int v){
        boolean vis[]=new boolean[v+1];
        dfs(sourse,vis,adj);
        
        return vis[dest];
    }
    public static void dfs(int start,boolean vis[],ArrayList<ArrayList<Integer>> adj){
        vis[start]=true;
        for(int it:adj.get(start)){
            if(!vis[it]){
                dfs(it,vis,adj);
            }
        }
    }
    public static void addedge(	ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
    }
//    0 1 1
//    0 2 1
//    1 2 1
//    2 3 1
//    1 3 1
//    1 4 1
//    3 4 1
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		int v=5;
		int e=7;
		
		for(int i=0;i<=v;i++){
		    adj.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<e;i++){
		    int s=sc.nextInt();
		    int d=sc.nextInt();
		    
		    addedge(adj,s,d);
		}
//		System.out.println(ispath(adj, 0, 3,v));
		if(ispath(adj, 0, 4, v)) {
			System.out.println("Yes path!");
		}else {
			System.out.println("No path!!!");
		}
	}
}
