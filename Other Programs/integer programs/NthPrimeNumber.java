import java.util.*;

class NthPrimeNumber
{
	public static boolean checkPrime(int num)
	{
		//int cnt = 0;
		for(int i=2;i<num-1;i++)
		{
			if (num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();

		int checkNumber = 1;

		int count = 1;
		if (num == 1)
		{
			System.out.println("2");
		}
		else
		{
			while (count != num)
			{
				checkNumber+=2;

				if (checkPrime(checkNumber))
				{
					count++;
					//checkNumber++;

				}
				
			}
			System.out.println(checkNumber);

		}
		
	}
}