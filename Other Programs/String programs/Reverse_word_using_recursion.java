import java.util.*;
public class Reverse_word_using_recursion
{
	static String ch="This is my string";
	static String [] str=ch.split(" ");
		
	static String final_string="";
	static void wordrev(int index, Stack stack,String temp)
	{
		int len=str[index].length()-1;		//check if error
		for(int i=0;i<=len;i++)
		{
			char ch=str[index].charAt(i);
			stack.push(ch);
		}
		while(!stack.isEmpty())
		{
			temp=temp+stack.pop();
		}
		final_string=final_string+temp+" ";
	}
	static String getrev(String [] str, int index) {
		Stack stack = new Stack();
		String temp = "";
		if (index == str.length - 1) {
			wordrev(index, stack, temp);
			return temp;
		} else {
			wordrev(index, stack, temp);
			return getrev(str, index + 1);
		}
	}
	public static void main(String[] args)
	{
		int index=0;
		getrev(str, index);
		System.out.println("final output string is :::"+final_string);
	}
}