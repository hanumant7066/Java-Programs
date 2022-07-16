import java.util.Scanner;
class PrimeChecker
{
	/* question 
				smallest prime no. is 2
				second smallest no. is 3

				you have to count the numbers in which count of second smallest prime no. is greater 
				or equal to smallest no..
				e.g 332    in this count of second smallest prime is more than smallest prime  

	*/
	static int count=0;
	static void checker(int num)
	{
		int count2=0;
		int count3=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;

			if(rem==2)
			{
				count2++;

			}
			if(rem==3)
			{
				count3++;

			}
			num=num/10;
		}
		if(count3>=count2 && count2!=0 && count3!=0)
		{
			System.out.println("This is the that number "+temp);

			count++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range ");
		int S=sc.nextInt();
		int L=sc.nextInt();
		if(S>0)
		{

			for(int i=S;i<=L;i++)
			{
				if(i>3 && i<11)
					count++;
				else
				{
					checker(i);
				}
				
			}
			System.out.println(count);
		}

	}
}