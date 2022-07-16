import java.util.Scanner;
public class Prime_Numbers
{
	public static void primeInRange1(int num)
	{
		boolean arr[]=new boolean[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=true;
		}

		for(int i=2;i<num;i++)
		{
			for(int j=i+i;j<num;j+=i)
			{
				arr[j]=false;
			}
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i])
				System.out.println(i);
		}

	}
	static boolean checkPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		primeInRange1(n);
		if(checkPrime(n))
			System.out.println(n+ " is Prime Number");
		else
			System.out.println(n+ " is Not Prime Number");
	}
}