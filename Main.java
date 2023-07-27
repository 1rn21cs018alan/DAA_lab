package daa;

public class Main {
	public static void main(String[] args) {
		int n=7,m=15;
		double [] P= {10,5,15,7,6,18,3},W= {2,3,5,7,1,4,1};
		double X[]=GreedyKnapsack.calc(P, W, n, m, 2);
		System.out.printf("X=(%.3f",X[0]);
		for(int i=1;i<n;i++)
			System.out.printf(",%.3f",X[i]);
		System.out.print(")");
	}
}
