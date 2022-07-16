import java.util.Scanner;

import java.util.Arrays;

class Reverse_in_k_size
{
		static void reverse(int []a,int start ,int end)
		{
			System.out.println(" i am in reverse method");
			while(start<end)
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}
		}
		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size ");
		int size=sc.nextInt();
		int []a=new int[size];

		System.out.println("enter the array: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		for(int i=0;i<size;i+=2)
		{
			System.out.println(" i am in");
			if(i+2 > size)
			{
				System.out.println(" i am in if condition");
				reverse(a,i,size-1);
				break;

			}
			reverse(a,i,i+2);

		}
		System.out.println(Arrays.toString(a));
	
	}
}