package daa;

public class MergeSort {
	private static int [] c;
	public static void calc(int a[],int n)
	{
		c=new int [n];
		Main_Class.start();
		merge(a,0,n-1);		
		Main_Class.stop();
	}
	private static void merge(int a[],int low, int high)
	{
		if(low>=high)
			return;
		int mid=(low+high)/2;
		merge(a,low,mid);
		merge(a,mid+1,high);
		combine(a,low,mid,high);
	}
	private static void combine(int[] a, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int i=low,j=mid+1,k=low;
		while(i<=mid && j<=high)
		{
			if(a[i]<a[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else
			{
				c[k]=a[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			c[k]=a[j];
			j++;
			k++;
		}
		for(i=low;i<=high;i++)
			a[i]=c[i];
	}
}
