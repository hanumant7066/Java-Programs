import java.util.*;
class Remove_Duplicate
{
	/* i/p: bananas
	   o/p: bans

	   keep first char as it is remove its duplicate order should be maintained;
	 */
	   static void secondMethod(String str) // O(n) approach
	   {
	   		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	   		for(int i=0;i<str.length();i++)
	   		{
	   			set.add(str.charAt(i));
	   		}
	   		for(char ch:set){
	   			System.out.print(ch);
	   		}
	   }
	   static void removeDuplicate(String str) // o(n*n)aproach
	   {
	   	String temp="";
	   		char []arr=str.toCharArray();

	   		for(int i=0;i<arr.length;i++)
	   		{
	   			int j;
	   			for(j=0;j<i;j++)
	   			{
	   				if(arr[i]==arr[j])
	   					break;
	   			}
	   			if(i==j){
	   				char ch=arr[i];
	   				temp+=ch;
	   			}

	   		}
	   		System.out.println("output is "+temp);

	   }
	   public static void main(String[] args) 
	   {
		   	String ch="bananas";
		   	String temp="";
		   	String ans="";

		   	//removeDuplicate(ch);
		   	secondMethod(ch);
		   		   			
		   			   	
		} 
		   		
}