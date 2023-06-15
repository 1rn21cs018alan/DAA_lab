package daa;
import java.util.Scanner;
public class linear_search {
	public static void calc(int a[],int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		int key=sc.nextInt();
		Main_Class.start();
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				Main_Class.stop();
				System.out.println("element found at "+i+"\n");
				return;
			}
		}
		Main_Class.stop();
		System.out.println("Element not found");
		
	}
}
