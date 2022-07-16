class PaliInteger
{
	static int counter=0; // 3
	static int new_count=0;
	static int getreverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int x=n%10;
			rev=(rev*10)+x;
			counter++;
			n=n/10;
		}
		return rev;

	}
	static int getPower(int pow)
	{
		if(pow==0)
			return 1;
		int ans=1;
		for(int i=0;i<=pow;i++)
		{
			ans=(ans*10);
		}
		System.out.println("ans"+ans);
		return ans;
	}
	static int checkPali(int rev)
	{
		int sum=0;
		while(rev>0)
		{
			if(new_count<counter)
			{	int rem=rev%10;
				sum=sum+(rem*getPower(new_count));
				new_count++;
				rev=rev/10;
			} 
			else
				break;

				
		}
		System.out.println(sum);
		return sum;
	}



	public static void main(String[] args) {
		int n=12321;
		int original=n;
		int rev=getreverse(n);
		int sum =checkPali(rev);
		if(sum==original)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
	}
}