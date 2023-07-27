package daa;
import java.util.ArrayList;
import java.util.Iterator;

public class Prims {
	public static void calc2(int[][] adj) {
		int n=adj.length,source=0,target=0,cost=0;
		boolean[] Visited=new boolean[n];
		Visited[0]=true;
		for(int i=1;i<n;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=0;j<n;j++) {
				if(Visited[j]) {
					for(int k=0;k<n;k++) {
						if(!Visited[k] && min>adj[j][k]) {
							min=adj[j][k];
							source=j;
							target=k;
						}
					}
				}
			}
			Visited[target]=true;
			cost+=adj[source][target];
			System.out.println("Edge("+source+","+target+")");
		}
	}
//	public static void calc()
//	{
//		ArrayList<ArrayList<Integer[]> > adj=new ArrayList<ArrayList<Integer[]>>();
//		for(int i=0;i<6;i++)
//			adj.add(new ArrayList<Integer[]>());
//		addEdge(adj, 0, 1, 60);		
//		addEdge(adj, 0, 2, 10);		
//		addEdge(adj, 1, 3, 20);		
//		addEdge(adj, 1, 4, 40);		
//		addEdge(adj, 1, 5, 70);		
//		addEdge(adj, 2, 5, 50);		
//		addEdge(adj, 3, 5, 80);		
//		addEdge(adj, 4, 5, 30);		
//		printGraph(adj);
//		MST_calc(adj);
//	}
//	private static void MST_calc(ArrayList<ArrayList<Integer[]>> adj) {
//		ArrayList<Integer[]> Et=new ArrayList<Integer[]>();
//		int n=adj.size();
//		boolean[] Vt=new boolean[n];
//		Vt[0]=true;
//		int [][] adjmat=new int[n][n];
//		for (int i=0;i<n;i++) {
//			ArrayList<Integer[]> a=adj.get(i);
//			for(int j=0;j<a.size();j++) {
//				adjmat[i][a.get(j)[0]]=a.get(j)[1];
//			}
//		}
//	}
//	public static void addEdge(ArrayList<ArrayList<Integer[]> > adj,int u, int v,int w)
//    {
//    	adj.get(u).add(new Integer[] {v,w});
//        adj.get(v).add(new Integer[] {u,w});
//    }
//	public static void addDirectedEdge(ArrayList<ArrayList<Integer[]> > adj,int u, int v,int w)
//    {
//    	adj.get(u).add(new Integer[] {v,w});
//    }
//    public static void printGraph(ArrayList<ArrayList<Integer[]> > adj)
//    {
//        for (int i = 0; i < adj.size(); i++) 
//        {
//            System.out.println("\nAdjacency list of vertex"+ i);
//            System.out.print("head");
//            for (int j = 0; j < adj.get(i).size(); j++) 
//            {
//            	Integer temp[]=adj.get(i).get(j);
//                System.out.print(" -> "+temp[0]+","+temp[1]);
//            }
//            System.out.println();
//        }
//    }
}
