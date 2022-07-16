import java.util.Arrays;
class Array_reverse
{
	static void firstMethod(int []arr1)
	{
		int start=0;
		int end=arr1.length-1;
		while(start<=end)
		{
			int temp=arr1[start];
			arr1[start]=arr1[end];
			arr1[end]=temp;
			start++;
			end--;
		}
	}
	static void secondMethod(int []arr)
	{
		int end=arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[end];
			arr[end]=temp;
			end--;
		}
	}
	public static void main(String[] args) {
		int []arr={1,2,3,4,5,6};
		firstMethod(arr);
		System.out.println("Array after executing first method ");
		System.out.println(Arrays.toString(arr));
		secondMethod(arr);
		System.out.println("Array after executing second method ");
		System.out.println(Arrays.toString(arr));


	}
}