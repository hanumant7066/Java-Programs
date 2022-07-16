import java.util.Scanner;
class Prime_or_Not
{
	static void prime(int no)
	{
		if(no==0)
			System.out.println("Not prime");
		else
		{
			int count=0;
			for(int i=2;i<=no/2;i++)
			{
				if(no%i==0){
					count++;
					break;
				}
			}
			if(count==0){
				System.out.println("Prime Number");
			}else
				System.out.println("Not prime");
		}
	}
	static void check(int no)
	{
		if(no<0)
		{
			System.out.println(no);
		}
		else if(no>=0){
			prime(no);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		check(number);
		
	}
}