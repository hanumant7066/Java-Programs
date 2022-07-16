import java.util.Scanner;
class Series3
{
		// 1,2,1,3,2,5,3,7,5,11,8,13,13  odd-fibbonassi even-prime
	static void fibbo(int n)
	{
		if(n==0)
		{
			System.out.println("1");
		}
		else
		{
			int n1=1;
			int n2=1;
			for(int i=1;i<=n;i++)
			{
				int n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			System.out.println(n2);
		}
	}
	static void prime(int n)
	{
		int count=1;
		int num=2;
		while(n>=count)
		{
			     int cnt=0;
				for(int i=2;i<num/2+1;i++)
				{
					if(num%i==0){
						cnt++;
						break;
					}
				}
				if(cnt==0)
				{
					count++;
				}
				num++;

		}
		System.out.println(num-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();

		if(N%2==1)
		{
			fibbo(N/2-1);
		}
		else{
			prime(N/2);
		}
		
	}
}