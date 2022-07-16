class Quick_Sort_Algo
{
	static int quickSort(int []arr,int low,int high)
	{
		int mid=(low+high)/2;
		while(low<=high){
			while(arr[low]<arr[mid]){
				low++;
			}
			while(arr[high]>arr[mid]){
				high--;
			}
			if(low<=high){
				int temp=arr[high];
				arr[high]=arr[low];
				arr[low]=temp;

				low++;
				high--;
			}
		}
		return low;
	}
	static void quickSortRecursion(int []arr,int low,int high){ // Both works fine
		
		// int pivot=quickSort(arr,low,high);
		// if(low<pivot){
		// 	quickSortRecursion(arr,low,pivot-1);   // left hand side Recursion;
		// }
		// if(pivot<high){
		// 	quickSortRecursion(arr,pivot,high);    // Right hand side Recursion;
		// }
		
		if(low<high){
			int pivot=quickSort(arr,low,high);

			quickSortRecursion(arr,low,pivot-1);
			quickSortRecursion(arr,pivot,high);
		}


	}
	public static void main(String[] args) {
		int []arr={2,4,5,6,6,5,5,5,5,2,3,4,2,8,1};
		quickSortRecursion(arr,0,arr.length-1);
		System.out.println("Sorted array is as follow ");
		for(int x:arr){
			System.out.print(x+" ");
		}
	}

}