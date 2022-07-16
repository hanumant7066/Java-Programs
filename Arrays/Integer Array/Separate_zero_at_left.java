import java.util.Arrays;
class Separate_zero_at_left
{
	/* i/p [1,2,0,3,0,0,4,5]
	   o/p [0,0,0,1,2,3,4,5] */
	static void secondMethod(int []arr)
	{
		int counter=arr.length-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==0)
			{
				continue;

			}else{
				arr[counter]=arr[i];
				counter--;
			}
		}
		while(counter>0)
		{	arr[counter]=0;
			counter--;}
	}
	static void moveZeroAtLeft(int []arr)
	{
		int counter=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				int temp=arr[counter];
				arr[counter]=arr[i];
				arr[i]=temp;
				counter++;
			}

		}
	}
	public static void main(String[] args) {
	     int []arr={0,2,0,0,0,0,4,0};
	    // moveZeroAtLeft(arr);
	     secondMethod(arr);
	     System.out.println(Arrays.toString(arr));		   	
    }
}