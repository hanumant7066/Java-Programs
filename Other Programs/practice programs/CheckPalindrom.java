import java.util.*;
class CheckPalindrom
{
	public static void main(String []args)
	{

		String name1="abdcba";
		int k=name1.length()-1;
		for(int i=0;i<name1.length();i++)
		{
			for(int j=name1.length()-1;j>=0;j--)
			{
				if(name1.charAt(i)==name1.charAt(k))
				{
					if(k==0)
					{
						System.out.println("palindrom string");
					}
					k--;
					break;
				}else
				{
					System.out.println("not palindrom");
					k=10;
					break;
				}
			}
			if(k==10)
			{
				break;
			}

		}
				}
}