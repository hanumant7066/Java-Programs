class Minimum_weighing_of_balls
{
	static int count=0;
	static int cal_weight(int N)
	{
		count++;
		int ans=N/3;
		if(ans==1)
			return 1;
	   	return cal_weight(N/=3);

	}
	public static void main(String []args)
	{
		int n=6561;
		cal_weight(n);
		System.out.println(count);

	}
}