public class LongestSameCount{

	public static int longestCount(int[] arr, int length){
		int maxcnt=0;
		int tempcnt=1;
		for(int i=0;i<arr.length-1;i++)//int arr[] = {0,0,0,1,0,1,1,0,0,0,0,0};
		{
			if(arr[i]==arr[i+1] && i==arr.length-2 && maxcnt<tempcnt)
			{
				maxcnt=tempcnt;
				maxcnt++;
			}

			if(arr[i]==arr[i+1])
			{
				tempcnt++;
				continue;
			}
			if(maxcnt<tempcnt){
				maxcnt=tempcnt;

			}
			tempcnt=1;
			


		}
		
		return maxcnt;
	}


	


	public static void main(String args[]){

		int arr[] = {0,0,1,0,0,0};
	    int length = arr.length;
		
		int longest_count = longestCount(arr,length);

		System.out.println(longest_count);

	}

}