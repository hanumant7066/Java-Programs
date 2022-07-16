import java.util.*;
class Max_Frequent_Integer_1
{
	public static void main(String[] args) {
		int []arr={2,3,4,3,4,4,5,4,1};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(arr[0],1);
		int max_count=1;
		int max_element=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int val=map.get(arr[i]);
				val++;
				map.put(arr[i],val);
			}
			else
				map.put(arr[i],1);
			int val1=map.get(arr[i]);
			if(val1>max_count)
			{
				max_count=val1;
				max_element=arr[i];
			}
		}
		System.out.println("maximum frequent integer is "+max_element+" and count is "+max_count);
		
	}
}