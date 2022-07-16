import java.util.*;
class Minion_Game
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		ArrayList<String> klist=new ArrayList<String>();
		ArrayList<String> slist=new ArrayList<String>();

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
					String temp=String.valueOf(str.charAt(i));
					klist.add(temp);
					for(int k=i+1;k<str.length();k++)
					{
						temp+=str.charAt(k);
						klist.add(temp);
					}

			}else
			{
				
				//for(int j=i;j<str.length();j++)
				//{
					String temp=String.valueOf(str.charAt(i));
					slist.add(temp);
					for(int k=i+1;k<str.length();k++)
					{
						temp+=str.charAt(k);
						slist.add(temp);
					}
				//}
			}
		}
		if(klist.size()>slist.size())
			System.out.println("Kelvin "+klist.size());
		else
			System.out.println("s "+slist.size()+" k "+klist.size());
	}
}