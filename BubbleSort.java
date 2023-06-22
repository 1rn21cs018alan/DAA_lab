package daa;

public class BubbleSort {
	public static int[] calc(int a[],int n)
	{
		Main_Class.start();
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		Main_Class.stop();
		return a;
	}
}
