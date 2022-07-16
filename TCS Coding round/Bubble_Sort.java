import java.util.Arrays;
class Bubble_Sort
{
	static void bubble(int []arrs)
	{
		for(int i=0;i<arrs.length-1;i++)
		{
			for(int j=0;j<arrs.length-i-1;j++)
			{
				if(arrs[j]>arrs[j+1])
				{
					int temp=arrs[j];
					arrs[j]=arrs[j+1];
					arrs[j+1]=temp;
				}
			}
		}
		

	}
	public static void main(String[] args) 
	{
		int []arr={64,34,25,12,22,11,2};

		bubble(arr);
		System.out.println(Arrays.toString(arr));


	}
}