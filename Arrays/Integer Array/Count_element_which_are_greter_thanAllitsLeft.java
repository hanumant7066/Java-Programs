class Count_element_which_are_greter_thanAllitsLeft
{
	/*count the no. of array elements such that all the elements to
	 its left are strictly smaller than it,
	 i/p: {2,8,4,15}
	 o/p: 4
	 */
	 static void getCountMethod2(int arr1[]){
	 	int count=1;
	 	int first_item=arr1[0];
	 	for(int i=1;i<arr1.length;i++)
	 	{
	 		
	 		if(first_item<arr1[i]){
	 			count++;
	 			first_item=arr1[i];
	 		}
	 	}
	 	System.out.println(count);
	 }
	 static void getCountMethod1(int arr[]){ 
	 	int count=1;
	 	for(int i=arr.length-1;i>=1;i--){
	 		for(int j=0;j<i;j++){
	 			if(arr[j]>arr[i]){
	 				break;
	 			}
	 			if(j==i-1){
	 				count++;
	 			}
	 		}

	 	}
	 	System.out.println(count);
	 }
	 public static void main(String[] args) {
	 	int arr[]={3,3,3,3,3};
	 	getCountMethod2(arr);
	 }
}