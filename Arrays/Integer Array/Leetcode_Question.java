class Leetcode_Question
{
	/* Return true if there exists i,j,k such that arr[i]<arr[j]<arr[k] given
	0<=i<j<k<=n-1;
	i/p [1,2,3,4,5]
	o/p true;

	i/p [5,4,3,2,1]
	o/p false
	*/
	static boolean checktrue(int[]arr)
	{
		int i=0;
		int j=i+1;
		while(true)
		{
			if(arr[i]<arr[j])
			{
				int k=j+1;
				while(k<arr.length)
				{
					if(arr[i]<arr[j] && arr[j]<arr[k])
						{
							System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
							return true;
						}
					k++;
				}
				if(j==arr.length-1)
				{
					i++;
					j=i+1;
				}
				else{
					j++;
				}

			}
			else{
				if(j==arr.length-1)
				{
					i++;
					j=i+1;
				}
				else
					j++;

			}
			if(i==arr.length-2)
			{
				return false;
			}
		}
	}
	public static void main(String[] args) {
		int []arr={1,2,3,4,5};
		System.out.println(checktrue(arr));
	}
}