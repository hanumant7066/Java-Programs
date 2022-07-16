class Factorial
{
	static long getFact(long num)
	{
		if(num==0 || num==1)
			return 1;
		else 
			return num*getFact(num-1);

	}
	static long getFact1(long num)
	{
		//int n=1;
		long mult=1;
		for(int i=1;i<=num;i++)
		{
			mult*=i;
		}
		return mult;
	}
	public static void main(String[] args) {
		long num=Long.parseLong(args[0]);
		if(num>=0)
		{
			long ans=getFact1(num);
			System.out.println("factorail of number is "+ans);

		}	
	}
}