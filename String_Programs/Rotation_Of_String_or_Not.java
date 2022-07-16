import java.util.Scanner;
import java.util.Arrays;
class Rotation_Of_String_Or_Not
{
	static boolean rotate(char []ch1, char[]ch2)
	{
		char temp=ch2[0];
		for(int i=0;i<ch2.length-1;i++)
		{
			ch2[i]=ch2[i+1];
		}
		ch2[ch2.length-1]=temp;
		boolean result=Arrays.equals(ch1,ch2);
		if(result)
			return true;
		else
			return false;
	}
	static boolean checkRotation(String s1,String s2)
	{
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		
		if(ch1.length!=ch2.length)
			return false;
		
		for(int i=0;i<ch2.length;i++){
			if(rotate(ch1,ch2))
				return true;
		}
		return false;


	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter first String ");
		String s1=sc.next();
		System.out.println("Please Enter second String ");
		String s2=sc.next();
		Boolean result=checkRotation(s1,s2);
		if(result)
			System.out.println(s2+" is Rotation of  "+s1);
		else
			System.out.println(s2+" is Not Rotation of  "+s1);
		
	}
}