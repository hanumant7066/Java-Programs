import java.util.*;
import java.math.*;
class PrimeSumInRange
{
	public static void main(String[] args) 
	{
		if(args.length==2)
		{
		int N1=Integer.parseInt(args[0]);
		int N2=Integer.parseInt(args[1]);

		long sum=0;

		for(long i=N1+1;i<N2;i++)
		{
			int count=0;
			for(long j=2;j<=i/2;j++)
			{
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0){
				sum+=i;
			}
		}
		System.out.println("sum of all prime number withing given range is "+sum);	}
	}
}