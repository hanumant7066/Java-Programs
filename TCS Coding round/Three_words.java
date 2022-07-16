import java.util.Scanner;
class Three_words
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		String w1=sc.next();
		String w2=sc.next();
		String w3=sc.next();
		String tempw1="";

		String tempw4=w3.toUpperCase();

		for(int i=0;i<w1.length();i++)
		{
			char ch=w1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{

				tempw1+='$';
			}
			else
				tempw1+=ch;
		}

		String tempw2="";

		for(int i=0;i<w2.length();i++)
		{
			char ch=w2.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				tempw2+=ch;
			}
			else
			{
				tempw2+='#';
			}
		}

		// String tempw3="";
		// for(int i=0;i<w3.length();i++)
		// {
		// 	char ch=w3.charAt(i);

		// 	tempw3+=ch.toUpperCase();
		// }
		System.out.println(tempw1+tempw2+tempw4);






	}
}