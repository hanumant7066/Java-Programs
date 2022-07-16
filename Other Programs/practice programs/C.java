/*program to find duplicate character from string */
import java.util.*;
public class Duplicate_Char_From_String
{	
	public static void main(String [] args)
	{
		String str="abcdabc man sameer and";
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