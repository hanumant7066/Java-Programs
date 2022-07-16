import java.util.*;
class Zero_one_count
{
	// arr={0,1,0,1,0,0,0}
	// 0/p= 4
	//arr={0,0,0,1,0,0,0} 
	// o/p= 2
	// consicutive 0 and 1 count should be at output 
	// Amazone asked question

	static int getCount(int []arr)
	{
		int maxcnt=0;
		int tempcnt=0;
		int counter=0;
		int current_int=arr[counter];
		while(counter<arr.length-1)
		{
			if(arr[counter]==0)
			{
				if(arr[counter]!=arr[counter+1])
				{
					tempcnt+=2;

				}
				else
				{
					tempcnt=0;
				}
				if(tempcnt>maxcnt){
					maxcnt=tempcnt;
				}
				if(arr[counter]==arr[counter+1]){
					counter+=1;
				}
				else{
					counter+=2;
				}

			}
			else{
			counter+=1;}
			
			
		}
		return maxcnt;


	}
	static int usingStack(int[]arr){
		int counter=0;
		Stack<Integer> stack=new Stack<Integer>();
		int tempcnt=0;
		int maxcnt=0;

		while(counter<arr.length-1)
		{
			stack.push(arr[counter]);
			if(stack.pop()==0 && arr[counter+1]==1)
			{
				tempcnt+=2;
				counter+=2;
				if(tempcnt>maxcnt){
					maxcnt=tempcnt;
				}
			}
			else{
				counter+=1;
				tempcnt=0;
			}
		}
		return maxcnt;
	}
	public static void main(String[] args) {
		int []arr={1,0,1,0,0,0,1,0,1};

		System.out.println(getCount(arr));

		System.out.println(usingStack(arr));

		
	}
}