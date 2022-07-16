class Binary_search_algo
{

	public static int searchItem(int item,int arr[])
	{
		int start=0;
		int end=arr.length-1;

		

		while (start <= end)
		{
			int mid=(start + end)/2;
			if (arr[mid]==item)
				return mid;

			else if (arr[mid] > item)
			{
				end = mid - 1;
			}
			else
				start = mid + 1;

		}
		return -1;
	}

	public static void main(String[] args) {
		int []arr={2,3,4,6,8,9,15,20};

		int item=30;
		System.out.println("item found at position "+searchItem(item,arr));









		// int low=0;
		// int high=arr.length-1;
		// int mid=(low+high)/2;
		// int item=15;

		// while(low<=high)
		// {
		// 	if(arr[mid]==item){
		// 		System.out.println("The "+item+" is at "+mid+" position");
		// 		break;
		// 	}
		// 	else if(arr[mid]<item)
		// 	{
		// 		low=mid+1;
		// 	}else
		// 	{
		// 		high=mid-1;
		// 	}
		// 	mid=(low+high)/2;

		// }
		// if(low>high)
		// 	System.out.println(item+" not found in the array");
	}
}