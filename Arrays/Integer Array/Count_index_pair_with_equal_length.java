class Count_index_pair_with_equal_length
{
	// given an array of n elements. the task is to count the total number
	// of indices such that arr[i]==arr[j]and i!=j.
	// i/p=arr{1,1,2}      
	// o/p 1             
	// i/p=arr{1,1,1}
	// o/p 3
	// i/p=arr{1,1,2,3,2,1,2,3,1}  
	// o/p 1
	public static void main(String[] args) {
		int []arr={1,1,2,3,2,1,2,3,1};
		int count=0; 
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					System.out.println("("+i+","+j);
				}

			}
		} 
		System.out.println(count);    
		
	}
}