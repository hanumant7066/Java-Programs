public class Duplicate_char_from_string
{
	public void getduplicatechar(String str)
	{
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]=='*')
				{
					break;
				}
				if(ch[i]==ch[j])
				{
					ch[j]='*';
					count++;
				}
			}
			if(count>0 && ch[i]!=' ')
			{
				System.out.println(ch[i]);
			}
		}

	}
	public static void main(String []args)
	{
		Duplicate_char_from_string obj=new Duplicate_char_from_string();
		String str="abcababbc mno m";
		obj.getduplicatechar(str);
	}
}