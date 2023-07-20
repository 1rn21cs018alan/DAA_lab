package daa;

public class QuickSort {
	public static int[] calc(int [] a, int n)
	{
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++)
			arr[i]=a[i];
		arr[n]=Integer.MAX_VALUE;
		Main_Class.start();
		Quick(arr, 0, n-1);
		Main_Class.stop();
		return arr;
	}
	private static void Quick(int a[],int low, int high)
	{
		if(low>=high)
			return;
		int k=Partition(a,low,high);
		Quick(a, low, k-1);
		Quick(a, k+1, high);
	}
	private static int Partition(int[] a, int low, int high) {
		int key=a[low],i=low,j=high+1;
		while(i<j)
		{
			while(key>=a[i]&& i<high)
			{
				i++;
			}
			while(key<=a[j]&&j>low)
			{
				j--;
			}
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[low];
		a[low]=a[j];
		a[j]=temp;
		return j;
	}
}
