import java.util.Arrays;
public class Anagram12{
	public static String anagrams(String s1, String s2)
	{
		char []ch=s1.toCharArray();
		char []ch1=s2.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch1);

		if(Arrays.equals(ch,ch1))
		{
			return "String is anagrams";
		}
		else
		{
			return "String is not anagrams";
		}
	}
	public static void main(String [] args)
	{
		String first_string="add";
		String second_string="dad";

		System.out.println(anagrams(first_string,second_string));
	}
}