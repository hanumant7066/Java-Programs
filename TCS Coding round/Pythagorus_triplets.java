import java.util.Scanner;
class Pythagorus_triplets
{
	static int checksquare(int n)
	{
		for(int i=n/2;i>=1;i--)
		{
			if(i*i==n)
				return i;
		}
		return 0;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int num=5;
		while(num<=N)
		{
			int j=num-1;
			while(j>2)
			{
				int diff=(num*num)-(j*j);
				int result=checksquare(diff);
				if(result!=0)
				{
					System.out.println(result+" "+j+" "+num);
					break;
				}
				else
				{
					j--;
				}
			}
			num++;

		}
		
	}
}