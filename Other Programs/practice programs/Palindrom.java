import java.util.*;
class Palindrom
{
	public static void main(String []args)
	{

		String name1="abcdcba";
		int k=name1.length()-1;
		for(int i=0;i<name1.length();i++)
		{
			for(int j=name1.length()-1;j>=0;j--)
			{
				if(name1.charAt(i)==name1.charAt(k))
				{
					k--;
					break;
				}else
				{
					k=name1.length()+1;
					break;
				}
			}
			if(k==name1.length()+1)
			{
				break;
			}

		}
		if(k==name1.length()+1)
			{
				System.out.println("not palindrom");
			}
		else
		{
			System.out.println(" palinderom");
		}


	}
}