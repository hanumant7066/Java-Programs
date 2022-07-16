import java.util.Arrays;
class Shuffle_of_two_string
{
	/* first="abc";
	   second="def";
	   third="dabecf";   order should also maintained

	   third string is shuffle of first and second;  
	*/
	   public static void main(String[] args) 
	   {
	   		String first="amc";
	   		String second="def";
	   		String third="dabecf";

	   		if((first.length()+second.length())==third.length())
	   		{
	   			char []str1=first.toCharArray();
	   			char []str2=second.toCharArray();
	   			char []str3=third.toCharArray();
	   			int cnt1=0;
	   			int cnt2=0;
	   			int cnt3=0;
	   			int cnt5=0;

	   			while(cnt3<str3.length)
	   			{
	   				if(cnt1<str1.length && str3[cnt3]==str1[cnt1])
	   				{
	   					cnt3++;
	   					cnt1++;
	   				}
	   				else if(cnt2<str2.length && str3[cnt3]==str2[cnt2])
	   					{
	   						cnt3++;
	   						cnt2++;
	   					}
	   					else{
	   						System.out.println("Not Shuffled strings ");
	   						cnt5++;
	   						break;
	   					}
	   			}
	   			if(cnt5==0)
	   				System.out.println("String are shuffled of each other");
	   		}
	   		else
	   			System.out.println("third string is not shuffle of fist and second");
	   }

}