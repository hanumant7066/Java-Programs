import java.util.Scanner;
class StrongNumber
{
	/*		Strong number is a number that 
			when we calculate factorial of each digit in it and its sum is
			equal to no. itself

			e.g 145
				1!=1
				4!=24
				5!=120
				sum=145

				find all the strong numbers within given range
	*/
	static int getfact(int num)
	{
		int mul=1;
		for(int i=1;i<=num;i++)
		{
			mul*=i;
		}
		return mul;
	}
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of range i.e N ");
			int N=sc.nextInt();
			for(int i=1;i<=N;i++)
			{
				int sum=0;
				int temp=i;
				while(temp>0)
				{
					int rem=temp%10;
					int result=getfact(rem);
					sum+=result;
					temp=temp/10;
				}
				if(sum==i)
					System.out.println("NUmber is "+i);
			}
	}
}