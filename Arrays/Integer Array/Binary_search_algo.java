class Binary_search_algo
{
	public static void main(String[] args) {
		int []arr={2,3,4,6,8,9,15,20};

		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		int item=15;

		while(low<=high)
		{
			if(arr[mid]==item){
				System.out.println("The "+item+" is at "+mid+" position");
				break;
			}
			else if(arr[mid]<item)
			{
				low=mid+1;
			}else
			{
				high=mid-1;
			}
			mid=(low+high)/2;

		}
		if(low>high)
			System.out.println(item+" not found in the array");
	}
}