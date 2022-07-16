class Count_Array_greter_smaller{
	/*given an array of integers, the task is to find the
	number of element which are strictly greter than all t
	he elements preceding it and strictly greater than
	at least K elements on its right.
	i/p: {2,5,1,7,3,4,0} K=3
	o/p: 2  */  // 5 and 7 satisfies above conditions so ans is 2;

	static boolean checknumber(int []arr,int index,int k){
		for(int i=0;i<index;i++){  // checking all left side element smaller or not
			if(arr[i]>arr[index]){
				return false;
			}
		}
		int count=0;
		for(int i=index+1;i<arr.length;i++){  //checking for right side;
			if(arr[index]>arr[i]){
				count++;
			}
			if(count>=k){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int []arr={2,5,1,7,3,4,0};
		int k=3;
			int count1=0;
		for(int i=0;i<arr.length;i++){
			if(checknumber(arr,i,k)){
				count1++;
				System.out.print(arr[i]+"  ");
			}
			

		}
		System.out.println();
		System.out.println(count1);	
	}
}