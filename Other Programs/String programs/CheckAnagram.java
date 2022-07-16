import java.util.Arrays;
public class CheckAnagram
{
	public static String anagrams12(String s1, String s2)
	{
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();

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
		String first_string="ddp";
		String second_string="adpd";

		System.out.println(anagrams12(first_string,second_string));
	}
}