package daa;

public class simpleCalc {
	public static int add(int a[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	
	public static int mul(int a[],int n)
	{
		int prod=0;
		for(int i=0;i<n;i++)
		{
			prod*=a[i];
		}
		return prod;
	}
	public static float add(float a[],int n)
	{
		float sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	
	public static float mul(float a[],int n)
	{
		float prod=0;
		for(int i=0;i<n;i++)
		{
			prod*=a[i];
		}
		return prod;
	}
	public static float add(float a,float b)
	{
		return a+b;
	}
	public static float sub(float a,float b)
	{
		return a-b;
	}
	public static float mul(float a,float b)
	{
		return a*b;
	}
	public static float div(float a,float b)
	{
		return a/b;
	}
	public static int mod(int a,int b)
	{
		return a%b;
	}
}
