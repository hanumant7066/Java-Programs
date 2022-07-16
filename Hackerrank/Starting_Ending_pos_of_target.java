class Starting_Ending_pos_of_target
{
	public static void main(String[] args) {   2,9    3,6   1,8
		int []arr={7,8,7,8,8,4,9};
		int target=5;
		int start=0;
		int end=arr.length-1;

		int startpos=0;
		int endpos=0;

		while(start<=end)
		{
			if(arr[start]==target && startpos==0){
				startpos=start;
			}
			if(arr[end]==target && endpos==0){
				endpos++;
			}
			if(endpos!=0){
				end++;
			}
			start++;
			end--;

		}
		if(startpos==0 && endpos==0)
			System.out.println("[-1,-1]");
		
		else{endpos=--start;
		System.out.println("["+startpos+","+endpos+"]");}
	}


}