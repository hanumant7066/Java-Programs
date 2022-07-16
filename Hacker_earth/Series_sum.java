import java.util.*;
class Series_sum
{
	static long getSolution(int []L,int []R,int N)
	{
		long sum=(1000000*1000001)/2;
		System.out.println("total sum is "+sum);

		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();

		long tempsum=0;
		for(int i=0;i<N;i++)
		{
			for(int j=L[i];j<=R[i];j++)
			{
				if(!set.contains(j)){
					set.add(j);
					tempsum+=j;

				}
			}
		}
		System.out.println("tep sum is "+tempsum);
		long res=sum-tempsum;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []L=new int[N];
		int []R=new int[N];
		for(int i=0;i<N;i++)
		{
			L[i]=sc.nextInt();
			R[i]=sc.nextInt();
		}
		long result=getSolution(L,R,N);
		System.out.println(result);
	}
}