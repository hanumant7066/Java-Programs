class Quick_sort
{
	// complete implimentation of quick sort algorithm;
	static int partition(int []arr,int start,int end)
	{
		int pi=(start+end)/2;
		while(start<=end)
		{
			while(arr[start]<arr[pi])
			{
				start++;
			}
			while(arr[end]>arr[pi])
			{
				end--;
			}
			if(start<=end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}

		}
		return start;
	}
	static void quickrecursion(int[]arr,int start,int end)
	{
		int piv=partition(arr,start,end);
		if(start<piv-1){
			quickrecursion(arr,start,piv-1);   // left hand side recursion;
		}
		if(piv<end){
			quickrecursion(arr,piv,end);        //right hand side recursion;
		}	
	}
	static void printArray(int []arr)
	{
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		int []arr={5,4,7,22,0,5,7,2,9,8};
		int len=arr.length;

		quickrecursion(arr,0,len-1);
		printArray(arr);


		

	}
}