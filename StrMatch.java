package daa;

public class StrMatch {
	public static int calc(String Text, String Pattern)
	{
		int n=Text.length();
		int m=Pattern.length();
		int i,j;
		char T[]=Text.toCharArray();
		char P[]=Pattern.toCharArray();
		for(i=0;i<=n-m;i++)
		{
			for(j=0;j<m;j++)
			{
				if(P[j]!=T[i+j])
					break;
			}
			if(j==m)
				return i;
		}
		return -1;
	}
}
