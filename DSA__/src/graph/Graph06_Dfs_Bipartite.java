package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph06_Dfs_Bipartite {
	
	static boolean dfsCheck(ArrayList < ArrayList < Integer >> graph, int node, int color[]) {
        for (Integer it: graph.get(node)) {
            if (color[it] == -1) {
                //Color of variable neighbor is the inverted color of variable node
                color[it] = 1 - color[node];

                if (!dfsCheck(graph, it, color))
                    return false;
            } else if (color[it] == color[node]) {
                return false;
            }
        }
        return true;
    }

    static boolean checkBipartite(ArrayList < ArrayList < Integer >> graph, int n) {
        int color[] = new int[n];

        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!dfsCheck(graph, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int n = 6;
        ArrayList < ArrayList < Integer >> graph = new ArrayList < ArrayList < Integer >> ();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList < Integer > ());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(4);
        graph.get(4).add(1);

        graph.get(1).add(5);
        graph.get(5).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(4);
        graph.get(4).add(3);

        graph.get(3).add(5);
        graph.get(5).add(3);

        if (checkBipartite(graph, n))
            System.out.println("It is a Bipartite Graph");
        else
            System.out.println("It is not a Bipartite Graph");
    }
//		int v=3;
//		int e=3;
//		Scanner sc=new Scanner(System.in);
//		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
//		
//		for(int i=1;i<=v+1;i++) {
//			adj.add(new ArrayList<Integer>());
//		}
//		
//		
//		for(int i=1;i<e;i++) {
//			int sourse=sc.nextInt();
//			int destination=sc.nextInt();
//			addedgege(adj,sourse,destination);
//	    }
//
//		
//		if(check_colour(adj, v)) {
//			System.out.println("Yes bipirate");
//		}else {
//			System.out.println("No bipirate");
//		}
//		
//}
}
