package daa;

public class distinct_or_not {
	public static boolean calc(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]==a[j])
					return false;
		return true;
	}
}
