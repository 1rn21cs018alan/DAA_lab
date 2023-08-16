package daa;
import java.util.*;
import java.lang.*;
public class Kruskals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=Integer.MAX_VALUE;
		int soln[][]=calc(new int[][] {
			{0 ,8 ,m ,m ,m ,m ,m ,16,m },
			{8 ,0 ,16,m ,m ,m ,m ,22,m },
			{m ,16,0 ,14,m ,8 ,m ,m ,4 },
			{m ,m ,14,0 ,18,28,m ,m ,m },
			{m ,m ,m ,18,0 ,20,m ,m ,m },
			{m ,m ,8 ,28,20,0 ,4 ,m ,m },
			{m ,m ,m ,m ,m ,4 ,0 ,2 ,12},
			{16,22,m ,m ,m ,m ,2 ,0 ,14},
			{m ,m ,4 ,m ,m ,m ,12,14,0 }
		});
		System.out.println("Solution:");
		for(int i=0;i<soln.length;i++)
			System.out.println(soln[i][0]+","+soln[i][1]+","+soln[i][2]);
	}
	public static int[][] calc(int [][]adj) {
		int n=adj.length,k=0;
		int [][]Et=new int [n*(n-1)/2][3];
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(adj[i][j]!=Integer.MAX_VALUE)
					Et[k++]=new int[] {i,j,adj[i][j]};
		for(int i=0;i<k;i++)
			for(int j=0;j<k-i-1;j++)
				if(Et[j][2]>Et[j+1][2])
				{
					int []temp=Et[j];
					Et[j]=Et[j+1];
					Et[j+1]=temp;					
				}
		int Parent[]=new int[n];
		int Solution[][]=new int [n-1][3];
		int t=0;
		for (int i=0;i<n;i++)
			Parent[i]=i;
		for (int i=0;i<k;i++)
		{
			int t1=Parent[Et[i][0]],t2=Parent[Et[i][1]];
			if(t1==t2)
				continue;
			for(int j=0;j<n;j++)
				if (Parent[j]==Math.max(t1,t2))					
					Parent[j]=Math.min(t1, t2);
			Solution[t++]=Et[i];
		}
		return Solution;	 
	}
}
