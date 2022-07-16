public class CheckPrimeFactor
{
	public void printPrimeFactor(int num)
	{
		int count=0;
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				System.out.println(i+"ff ");
				for(int j=2;j<=(i/2);j++)
				{
					if(i%j==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println(i);
				}if(count!=0)
				{
					count=0;
				}
			}
			else{continue;}
		}
	}
	public static void main(String []args)
	{
		CheckPrimeFactor obj=new CheckPrimeFactor();
		int num=555;
		obj.printPrimeFactor(num);
	}
}