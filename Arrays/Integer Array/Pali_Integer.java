import java.util.*;
class Pali_Integer
{
	static int c=0;
	static int pali(int m2)
	{
		int sum=0;
		while(m2!=0)
		{
			int x=m2%10;
			sum=sum+(x*Math.pow(10,c));
			c--;
			m2=m2/10;
		}
		return sum;
	}
	static void count(int m1)
	{
		while(m1!=0)
		{
			int x=m1%10;
			m1=m1/10;
			c++;
		}
	}
	public static void main(String[] args) {
		int n=12321;
		int m2=12321;
		count(n);
		int x=pali(m2);
		if(x==n)
			System.out.println("palindrom");
		else
			System.out.println("Not Palindrom");

	}
}