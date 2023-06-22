package daa;

public class SelSort {
	public static int[] calc(int a[],int n)
	{

		Main_Class.start();
		for(int i=0;i<n;i++)
		{
			int pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[pos]>a[j])
				{
					pos=j;
				}
			}

			int temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
		}
		Main_Class.stop();
		return a;
	}
}
