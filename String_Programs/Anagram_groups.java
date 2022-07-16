import java.util.*;
class Anagram_groups
{
	static String temp="";
	static void checkAnagram(String[]str,String s1,String s2,int j)
	{
		String temp1=s2;
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean result=Arrays.equals(ch1,ch2);
		if(result)
		{
			temp=temp+" "+s2;
			str[j]="##";
		}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();

		String []str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=="##")
				continue;
			temp+=str[i];
			for(int j=i+1;j<str.length;j++)
			{
				checkAnagram(str,str[i],str[j],j);
			}
			System.out.println(temp);
			temp="";
		}


	}

}