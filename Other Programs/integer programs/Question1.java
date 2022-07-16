import java.io.*;
class IllegalNumberOfArguments extends ArrayIndexOutOfBoundsException
{
	String s1;
	public IllegalNumberOfArguments(String s1)
	{
		this.s1=s1;
		System.out.println(s1);
	}
}
public class Question1
{
	public static void acceptinput(String b, String num1, String num2)throws IllegalNumberOfArguments
	{
             throw new IllegalNumberOfArguments("Exception occures:");		
		
	}
	
	public static void main(String []args)
	{

              
		try
		{
 			
		
		String b=args[0];
               

                int num1=args[1];
                	
	
                }	
}		
		catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.println("please enter three numbers on command line: ");
		}
		
	}
	
	
}
