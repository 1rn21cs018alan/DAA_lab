package daa;

public class TOH {
	public static void calc(int n,String S, String T, String D)
	{
		if(n==0)
			return;
		calc(n-1,S,D,T);
		System.out.println("move from "+S+" to "+D);
		calc(n-1,T,S,D);		
	}
}
