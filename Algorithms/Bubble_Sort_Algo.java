class Bubble_Sort_Algo
{
	public static void main(String[] args) {
		int []arr={5,6,3,8,1,1,3,4,1,9,4};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}