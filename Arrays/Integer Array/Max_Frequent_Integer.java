class Max_Frequent_Integer
{
    // O(n^2) approach
	public static void main(String[] args) {
		
		int []arr={2,4,5,4,3,4,7,2};
		int max_count=0;
		int max_element=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count>max_count)
				{
					max_count=count;
					max_element=arr[i];
				}
		}
		System.out.println("maximum frequent integer is "+max_element+" and count is "+max_count);

	}
}