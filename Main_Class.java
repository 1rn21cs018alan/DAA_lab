package daa;
import java.util.Random;
public class Main_Class {
	private static long time;
	public static void main(String[] args) {
		Random r=new Random();
//		start();
		int n=15;
		int [] arr= new int [n];
		for (int i=0;i<n;i++)
		{
			arr[i]=r.nextInt(100);
//			System.out.print(arr[i]+",");
		}
		arr[0]=1;
		System.out.println();

//		System.out.println("\n"+max_of_n.calc(arr,n));
//		print_n.calc(n);
//		System.out.println(distinct_or_not.calc(arr, n));
//		matrix a=new matrix(2,8,2);
//		matrix b=new matrix(8,2,5);
//		System.out.println(a+"\n");
//		System.out.println(b+"\n");
//		matrix.calc(a, b);
//
//		arr=linear_search.calc(arr, n);
//		arr=BubbleSort.calc(arr, n);
//		
		arr=SelSort.calc(arr, n);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		
		
//		stop();
	}
	public static void start()
	{
		time=System.nanoTime();
	}
	public static void stop()
	{
		System.out.println("\nTime elapsed="+(System.nanoTime()-time)+"ns");
	}
}
