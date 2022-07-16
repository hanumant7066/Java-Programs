class Sum_in_array
{
	static void summethod(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			arr[i]=sum;
		}
		

	}
	public static void main(String[] args) {
		int []arr={2,4,2,6,1,0};
		summethod(arr);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}