package daa;
import java.util.Random;
public class Main_Class {
	private static long time;
	public static void main(String[] args) {
		Random r=new Random();
//		start();
//		int n=30000;
//		start();
//		TOH.calc(n, "A", "B", "C");
//		stop();
//		int [] arr= new int [n];
//		for(int count=0;count<20;count++)
//		{
//			switch(2)
//			{
//			case 0:
//				//best case
//				for (int i=0;i<n;i++)
//				{
//					arr[i]=i;
//	//				System.out.print(arr[i]+",");
//				}
//				break;
//				
//			case 1:
//				//worst case
//				for (int i=0;i<n;i++)
//				{
//					arr[i]=n-i;
//	//				System.out.print(arr[i]+",");
//				}
//				break;
//			case 2://best case = average case
//				//average case
//				for (int i=0;i<n;i++)
//				{
//					arr[i]=r.nextInt(n);
//	//				System.out.print(arr[i]+",");
//				}
//			}
////			arr=SelSort.calc(arr, n);
////			MergeSort.calc(arr, n);
////			arr=QuickSort.calc(arr, n);
//			InsertionSort.calc(arr, n);
//		}

//		for (int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]+",");
//		}
//		arr[0]=1;
//		System.out.println();
//		
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
//		for(int i=0;i<n;i++)
//			System.out.print(arr[i]+"\t");
//		System.out.println(StrMatch.calc("something", "in"));
//		stop();
		Prims.calc2(new int[][] {
			{0,1 ,2 ,5},
			{1,0 ,99,2},
			{2,99,0 ,3},
			{5,2 ,3 ,0}
		});
	}
	public static void start()
	{
		time=System.nanoTime();
	}
	public static void stop()
	{
		System.out.println("\nTime elapsed="+(System.nanoTime()-time)+" ns");
	}
}
