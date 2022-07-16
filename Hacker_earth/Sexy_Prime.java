import java.util.Scanner;
public class Sexy_Prime
{
	static boolean checkPrime(int N)
	{
		for(int i=2;i<=N/2;i++)
		{
			if(N%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		if(L==1)
			L++;

		if(L%2==0)
			L++;
		while(L <= R-6)
		{
			if(checkPrime(L))
			{
				if((L+6) <= R  && checkPrime(L+6))
				{
					int num=L+6;
					System.out.print("("+L+","+num+") ");
				}
			}
			L+=2;
		}

	}
}