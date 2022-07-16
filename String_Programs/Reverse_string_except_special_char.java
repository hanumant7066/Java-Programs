import java.util.Arrays;
import java.util.Scanner;
class Reverse_string_except_special_char
{
	static boolean isChar(char ch){
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
			return true;
		}else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string with special character");
		String ch=sc.nextLine();
		char []str=ch.toCharArray();
		// Mc,b$A
		int start=0;
		int end=str.length-1;
		while(start<=end){
			
			while(!isChar(str[start])){
				start++;
			}
			while(!isChar(str[end])){
				end--;
			}
			if(start<=end){
				char temp=str[end];
				str[end]=str[start];
				str[start]=temp;
				start++;
				end--;
			}
		}
		String final_str="";
		for(int i=0;i<str.length;i++)
		{
			final_str+=str[i];
		}
		System.out.println("final string is "+final_str);
	}
}