class String_sort_using_bubble_sort
{
	public static void main(String[] args)
	{
		String []arr={"mahesh","amar","swapnil","hamu","sanket","rups"};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is : ");
		for(String x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
}