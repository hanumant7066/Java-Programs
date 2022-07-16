public class Assertion_validate
{
	static void calodd(int num1,int num2)
	{
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		
	}
	public static void main(String [] args)
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		assert (num1>0 && num2>0):"Both should be positive integers";
		assert num1<num2:"The second should be larger than the first";

		
		System.out.println("the all odd numbers between "+num1+" and "+num2+" are as follows");
		
		calodd(num1,num2);
		
	}
}