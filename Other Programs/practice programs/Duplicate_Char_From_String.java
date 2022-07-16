import java.util.*;
public class Duplicate_Char_From_String
{
	void getDuplicateCount(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]=='*')
				{
					break;
				}
				
				if(arr[i]==arr[j] && arr[i]!=' ')
				{
					arr[j]='*';
					count++;
					
				}
			}
			if(count>1)
			{
				System.out.println("duuplicate element "+arr[i]+" is ");
				
			}
		}
	}
	public static void main(String []args)
	{
		Duplicate_Char_From_String obj=new Duplicate_Char_From_String();
		String str="abcd abcd abcdef abcmnm";
		obj.getDuplicateCount(str);
	}
}





/*program to find duplicate character from string 
import java.util.*;
public class Duplicate_Char_From_String
{	
	public static void main(String [] args)
	{
		String str="abcdab";
		char []arr=str.toCharArray();
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i]==(arr[j]))
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}	
	}

}
*/