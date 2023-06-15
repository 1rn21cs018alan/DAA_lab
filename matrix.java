package daa;
import java.util.Random;

public class matrix {
	private static Random gen=new Random();
	public int row,col,arr[][]; 
	public matrix()
	{
		this.row=3;
		this.col=3;
		this.arr=new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j]=gen.nextInt(20);
	}
	public matrix(int row,int col)
	{
		this.row=row;
		this.col=col;
		this.arr=new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j]=gen.nextInt(20);
	}
	public matrix(int row,int col,int bound)
	{
		this.row=row;
		this.col=col;
		this.arr=new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j]=gen.nextInt(bound);
	}
	public String toString()
	{
		String mat="";
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				mat+=arr[i][j]+"\t";
			mat+="\n";
		}
		return mat;
	}
	public static void calc(matrix a, matrix b) 
	{
		if(a.col!=b.row)
		{
			System.out.println("Incompatible matrix");
		}
		matrix c=new matrix(a.row,b.col,1);
		for(int i=0;i<c.row;i++)
		{
			for(int j=0;j<c.col;j++)
			{
				c.arr[i][j]=0;
				for(int k=0;k<b.row;k++)
				{
					c.arr[i][j]+=a.arr[i][k]*b.arr[k][j];
				}
			}
		}
		System.out.println(c);
	}
}
