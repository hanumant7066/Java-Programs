import java.util.*;
class Test2
{
	public String anagrams(String s1,String s2)
	{
		char []ch=s1.toCharArray();
		char []ch1=s2.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch1);


		if(Arrays.equals(ch,ch1))
		{
			return "anagrams strings";
		}
		else
		{
			return "not anagrams";
		}

	}
	public static void main(String[] args) 
	{
		String s1="dad";
		String s2="add";

		Test2 obj=new Test2();
		System.out.println("output is "+obj.anagrams(s1,s2));


	}	


}
