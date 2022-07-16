
import java.util.*;
class Solution
{
	public static void main(String [] args)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(4);

		HashSet<Integer> set=new HashSet<Integer>();
		for(int ele: arr){
			set.add(ele);
		}
		System.out.println("Output is "+set);

	}
}