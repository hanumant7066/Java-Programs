public class SecondHighest{
	public void getSecondHighest(int[] num)
	{
		int large=num[0];
		int second=0;

		for(int i=0;i<num.length;i++)
		{
			if(num[i]>large)
			{
				second=large;
				large=num[i];
			}
			if(num[i]>second && num[i]<large)
			{
				second=num[i];
			}
		}
		System.out.println("second large element is "+second);


	}
	public static void main(String []args)
	{
		SecondHighest obj=new SecondHighest();
		int []num={1,2,32,21,24,31};
		obj.getSecondHighest(num);
	}
}