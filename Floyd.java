package daa;
import java.util.*;
public class Floyd {
	private static int max=Integer.MAX_VALUE>>1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		n=5;
		int [][]adj= new int [][]{
			{0	,2	,max,1	,8	},
			{6	,0	,3	,2	,max},
			{max,max,0	,4	,max},
			{max,max,2	,0	,3	},
			{3  ,max,max,max,0	}
		};
//		System.out.println(max);
//		System.out.println("Enter the source vertex");
//		int s = sc.nextInt();
		int sssp[][]=Floyd(adj);
		for(i=0;i<sssp.length;System.out.println(),i++)
			for(j=0;j<sssp.length;j++)
				System.out.print(sssp[i][j]+",");
	}
	public static int[][] Floyd(int [][]adj){
		int n=adj.length;
		int R[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				R[i][j]=adj[i][j];

		for(int k=0;k<n;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					R[i][j]=Math.min(R[i][j],R[i][k]+R[k][j]);
		return R;
	}
}
