class Noble_integers
{
	//given an array arr[] find a noble integer in it. An integer x is said
	//to be noble in arr if the number of integers greter than x  is equal
	//to x. if there are many noble integers, return an of them. if there
	//is no, then return -1,

	// i/p: {7,3,16,10};
	// /p: 3
	static int getNoble(int []arr){
		for(int i=0;i<arr.length;i++){
			int count=0;

			for(int j=0;j<arr.length;j++){
				if(arr[j]>arr[i] && i!=j){
					count++;
				}
			}
			if(arr[i]==count)
				return count;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]={7,3,16,10};
		System.out.println(getNoble(arr));
	}
}