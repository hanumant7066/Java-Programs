import java.util.HashSet;
public class Check_uniq_string_in_one_loop
{
	public static boolean checkUsingSet(String str)
	{
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if (!set.add(str.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean checkWithoutSet(String str)
	{
		boolean [] arr= new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			if(arr[str.charAt(i)])
				return false;
			arr[str.charAt(i)]=true;
		}
		return true;
		
	}

	public static boolean checkWithTwoLoops(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(str.charAt(i)==(str.charAt(j)))
					return false;
			}
		}
		return true;
	}

	public static boolean checkUniq(String str)
	{
		int check = 0;
		for(int i=0;i<str.length();i++)
		{
			int intValue = (str.charAt(i) - 'a');

			if ((check & (1 << intValue)) > 0)
				return false;

			// set bit in check variable
			check = check | (1 << intValue);
		}
		return true;
	}
	public static int FirstNonRepeating(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			boolean isanswer = true;
			int j;
			for(j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) && i != j)
				{
					isanswer=false;
					break;
				}
			}
			if(isanswer)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		String  str = "leetcode"; // leetcode
		System.out.println(checkUniq(str.toLowerCase()));
		System.out.println(checkUsingSet(str.toLowerCase()));
		System.out.println(checkWithoutSet(str.toLowerCase()));
		System.out.println(checkWithTwoLoops(str.toLowerCase()));
		System.out.println(FirstNonRepeating(str.toLowerCase()));


	}
}