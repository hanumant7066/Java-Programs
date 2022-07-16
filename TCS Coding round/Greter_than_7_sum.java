import java.util.*;
class Greter_than_7_sum
{
	static int getsum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}
	static int getpow(int num,int pow)
	{
		if(pow==1)
			return num;
		if(pow==0)
			return 1;
		return num*getpow(num,pow-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();

		String []arr=new String[N];
		int ans=0;

		for(int i=0;i<N;i++)
		{
			arr[i]=sc.next();

			int num=Integer.parseInt(arr[i]);
			int sum=getsum(num);
			if(sum>17)
			{
				ans+=getpow(2,i);
				//System.out.println("inside ans "+ans);
			}

		}
		System.out.println(ans);
		/*for(int i=0;i<N;i++)
		{
			String str=arr[i];

			for(int j=0;j<str.length();j++)
			{
						
			}

		}*/

	}
}