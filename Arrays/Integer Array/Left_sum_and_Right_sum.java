import java.util.*;
class Left_sum_and_Right_sum
{
	static int rightsum(int []a,int start,int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	// static int leftsum(int []a,int start,int end)
	// {
	// 	int sum=0;
	// 	for(int i=start;i<=end;i++)
	// 	{
	// 		sum+=a[i];
	// 	}
	// 	return sum;
	// }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size ");
		int size=sc.nextInt();
		int []a=new int[size];

		System.out.println("enter the array: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=1;i<a.length-1;i++)
		{
			sum+=a[i-1];
			// int lsum=leftsum(a,0,i-1);
			int rsum=rightsum(a,i+1,a.length-1);
			if(sum==rsum)
			{
				System.out.println("answer is "+a[i]);
				break;
			}
		}
	}
	
}