package daa;
import java.util.*;
public class Dijkstra {
	private static int max=Integer.MAX_VALUE>>1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		int dist[] = new int[10];
		Scanner sc = new Scanner(System.in);
		n=5;
		int [][]adj= new int [][]{
			{0,3,max,7,max},
			{3,0,4,2,max},
			{max,4,0,5,6},
			{7,2,5,0,4},
			{max,max,6,4,0}
		};
//		System.out.println(max);
		System.out.println("Enter the source vertex");
		int s = sc.nextInt();
		dist=dij(adj,s);
		for(i=0;i<dist.length;i++)
			System.out.println(s+" to "+i+"="+dist[i]);
	}
	public static int[] dij(int adj[][],int s)
	{
		int n=adj.length;
		boolean []visited=new boolean[n];
		int dist[]=new int [n];
		int unvis=-1, min;
		for(int i=0;i<n;i++)
		{
			visited[i] = false;
			dist[i] = adj[s][i];
		}
		visited[s] = true;
		for(int i=1;i<n;i++)
		{
			min = max;
			for(int j=0;j<n;j++)
				if((dist[j]<min)&&(!visited[j]))
				{
					min = dist[j];
					unvis = j;
				}
			visited[unvis] = true;
			for(int w=0;w<n;w++)
			{
				if(!visited[w] && (dist[w])>(dist[unvis]+adj[unvis][w]))
				{
					dist[w] = dist[unvis]+adj[unvis][w];
				}
			}
		}
		return dist;
	}
}