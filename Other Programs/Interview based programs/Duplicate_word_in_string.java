public class Duplicate_word_in_string
{
	public void getduplicate(String str)
	{
		String []words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			int count=0;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i]=="*")
				{
					break;
				}
				if(words[i].equals(words[j]))
				{
					words[j]="*";
					count++;
				}
			}
			if(count>0 && words[i]!="*")
			{
				System.out.println(words[i]);
			}

		}
	}
	public static void main(String []args)
	{
		Duplicate_word_in_string obj=new Duplicate_word_in_string();
		String str="my name is my name";
		obj.getduplicate(str);
	}
}