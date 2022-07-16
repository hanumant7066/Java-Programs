import java.util.*;

class Producing_Larger_num
{
	public static void printLargeNum(ArrayList<String> arr)
	{
		Collections.sort(arr,Collections.reverseOrder());
		for(String s:arr)
		{
			System.out.print(s);
		}

	}
	public static void main(String[] args) {
		String arr[]={"548","60"};
		ArrayList<String> str=new ArrayList<String>();
		for(String item:arr)
			str.add(item);
		printLargeNum(str);
	}
}