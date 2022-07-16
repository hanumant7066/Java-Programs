class Reduce_Array_By_deleting_left_if_smaller
{
	/* if left element of current element is less than that then delete
	   current element goes happending for entire array 

	   i/p: {2,4,1,3,4}
	   o/p: 2,1
	   */
	   public static void main(String[] args) {
	   	int []arr={5,4,3,2,1};
	   	System.out.print(arr[0]+" ");
	   	int previous=arr[0];
	   	for(int i=1;i<arr.length;i++){
	   		if(previous<arr[i]){
	   			continue;
	   		}
	   		System.out.print(arr[i]+" ");
	   		previous=arr[i];
	   	}

	   }
}