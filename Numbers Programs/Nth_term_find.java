import java.util.*; 	
class Nth_term_find
{
	/*
	1,2,1,3,2,5,3,7,5,11,8,13,13,17......
	at odd place fibbonasci sequence are there
	at even place prime number series are there

	write a program to to print Nth term of this series
	*/
	static int getFibbonacciAt(int N)
	{
		if(N==1)
			return 1;
		if(N==3)
			return 1;
		int n1=1;
		int n2=1;
		int count=3;
		while(true){
			int n3=n1+n2;
			if(count==N/2+1)
				return n3;
			n1=n2;;
			n2=n3;
			count++;
	}

		
	}
	static int getPrimeAt(int N)
	{

		int cnt=0;
		int num=2;
		while(true)
		{
			int check=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0){
					check++;
					break;
				}
			}
			if(check==0){
				cnt++;
			}
			if(cnt==N/2){
				return num;
				
			}
			num++;

		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N=sc.nextInt();
		int result;
		if(N%2==0)
			result=getPrimeAt(N);
		else
			result=getFibbonacciAt(N);
		System.out.println("Nth term is "+result);
	}
}