package daa;

public class InsertionSort {
	public static void calc(int[]a, int n)
	{
		Main_Class.start();
		for(int i=1;i<n;i++) {
			int v=a[i],j=i-1;
			while(j>=0 && a[j]>=v){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=v;
		}
		Main_Class.stop();
	}
}