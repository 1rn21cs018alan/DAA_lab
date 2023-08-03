package daa;

public class Kruskal {
	public void calc(int [][]adj,int n) {
		int [][]Et=new int[n][3];
		int k=0;
		for( int i=1;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				Et[k][0]=i;
				Et[k][1]=j;
				Et[k][2]=adj[i][j];
			}
		}
		
		
	}
}
