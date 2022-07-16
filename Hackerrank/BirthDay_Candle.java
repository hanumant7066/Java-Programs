class BirthDay_Candle
{
	/* you have an array say[3,5,4,5,5,1,2] which represents candle you have to print how many
	candle are there which has maximum integer; in this o/p should be 3...bcz maximum int
	5 is present 3 times;*/
	public static void main(String[] args) {
		int []arr={3,5,4,5,5,1,2};
		int max_int=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max_int==arr[i]){
				count++;
			}
			if(max_int<arr[i]){
				max_int=arr[i];
				count=1;
			}
		}
		System.out.println("maximum count of highest candle is "+count);
	}
}