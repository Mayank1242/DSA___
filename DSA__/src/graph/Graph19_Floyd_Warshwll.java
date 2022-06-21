package graph;

public class Graph19_Floyd_Warshwll {
	
	final static int INF = 99999, V = 4;
	 
   public static void floydWarshall(int graph[][])
    {
        int dist[][] = new int[V][V];
        int i, j, k;
 
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }
        
        for (i= 0; i< V; i++)   
        {
           
            for (j = 0; j< V; j++)    
            {
                
                for (k = 0; k < V; k++)   
                {
                    
                    if (dist[j][i] + dist[i][k] < dist[j][k])
                    	dist[j][k]=dist[j][i] + dist[i][k];
//                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
 
        
        printSolution(dist);
    }
 
  public static   void printSolution(int dist[][])
    {
        System.out.println("The following matrix shows the shortest "+
                         "distances between every pair of vertices");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }
 
    public static void main (String[] args)
    {
       
        int graph[][] = { {0,   5,  INF, 10},
                          {INF, 0,   3, INF},
                          {INF, INF, 0,   1},
                          {INF, INF, INF, 0}
                        };
       
 
       
        floydWarshall(graph);
    }
}
