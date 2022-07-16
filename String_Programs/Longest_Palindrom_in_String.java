import java.util.Scanner;
class Longest_Palindrom_in_String
{

	static int maxlen=0;
	static String maxword="";
	static void checkPali(char[] str,int start,int end)
	{
		String temp="";
		for(int i=start;i<=end;i++)
			temp+=str[i];
		String rev="";
		for(int k=end;k>=start;k--)
			rev+=str[k];
		if(temp.equals(rev))
		{
			if(rev.length()>maxlen){
				maxlen=rev.length();
				maxword=rev;
			}
		}

		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.next();
		char []str=st.toCharArray();

		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					checkPali(str,i,j);
				}
			}
		}
		System.out.println("maximum palindrom word is "+maxword+" length "+maxlen);
	}
}