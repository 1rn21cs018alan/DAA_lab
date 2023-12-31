package daa;

public class GreedyKnapsack {
	public static double[] calc(double[]P,double[]W,int n,double m,int sol)
	{
		double [] R=new double[n];
		double [] X=new double[n];
		double temp,profit=0;
		int[] index=new int [n];
		int ind=0;
		for(int i =0;i<n;i++)
		{
			R[i]=P[i]/W[i];
			X[i]=0;
			index[i]=i;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(R[j-1]>R[j])
				{
					temp=R[j];
					R[j]=R[j-1];
					R[j-1]=temp;
					temp=index[j];
					index[j]=index[j-1];
					index[j-1]=(int)temp;
				}
			}
		}
		ind=n-1;
		while(m>0&&ind>=0)
		{
			temp=W[index[ind]];
			if(temp<=m)
			{
				m-=temp;
				X[index[ind]]=1;
			}
			else
			{
				X[index[ind]]=m/temp;
				m=0;
			}
			profit+=P[index[ind]]*X[index[ind]];
			ind--;
		}
		System.out.printf("profit:%.3f\n",profit);
		return X;
	}
}
