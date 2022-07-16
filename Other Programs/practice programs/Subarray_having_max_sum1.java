import java.util.*;
class Subarray_having_max_sum1
{
	public static void main(String []args)
	{
		Stack stack=new Stack();

		int []arr={-2,4,5,6};
		// for(int i=0;i<arr.length;i++)
		// {
		// 	int sum=arr[i];
		// 	int maxsum=0;
		// 	for(int j=i+1;j<arr.length;j++)
		// 	{
		// 		sum+=arr[i];
		// 		if(sum>maxsum)
		// 		{
		// 			maxsum=sum;
		// 			int a[]=new int[j-i+1];
		// 			for(int k=i;k<=j-1+1;j++)
		// 			{
		// 				a[k]=arr[k];
		// 			}
		// 			if(stack.isEmpty();
		// 			{
		// 				stack.push(a);
		// 			}
		// 			else if(!stack.isEmpty())
		// 			{
		// 				stack.pop();
		// 				stack.push(a);
		// 			}

		// 		}
		// 	}
		stack.push(arr);
		System.out.println("maximum subarray is "+stack.pop());
		}
	}
