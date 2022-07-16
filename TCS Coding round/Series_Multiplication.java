import java.util.Scanner;
class Series_Multiplication
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long even=1;
		long odd=1;
		if(N%2==0)
		{
			for(int i=1;i<N/2;i++)
			{
				even*=3;
			}
			System.out.println(even);
		}
		else
		{
			for(int i=1;i<=N/2;i++)
			{
				odd*=2;
			}
			System.out.println(odd);
		}
	}
}