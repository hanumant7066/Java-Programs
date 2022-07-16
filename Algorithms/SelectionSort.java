class SelectionSort
{
	public static void main(String[] args) {
		int []arr={2,5,7,1,5,9,11,25,6};

		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[j] < arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println("Sorted array By using selection Sort");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
	}
}