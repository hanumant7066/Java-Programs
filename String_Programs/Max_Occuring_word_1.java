import java.util.HashMap;
class Max_Occuring_word_1
{   // O(n) 
	public static void main(String[] args) {
		String str1="ab mn cd cd cd cd ab mn ss";
		String []str=str1.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String max_word=str[0];
		int max_count=1;
		map.put(str[0],1);

		for(int i=1;i<str.length;i++)
		{
			if(map.containsKey(str[i]))
			{
				int val=map.get(str[i]);
				val++;
				map.put(str[i],val);
			}
			else
			{
				map.put(str[i],1);
			}
			int val=map.get(str[i]);
			if(val>max_count)
			{
				max_count=val;
				max_word=str[i];
			}
		}
		System.out.println("max frequenty word "+max_word+" and count is "+max_count);
	}
}