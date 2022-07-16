/*2. Write a program which accept two integers and an arithmetic operator from the     
command line and performs the operation. Fire the following user defined exceptions:
	a. If the no of arguments are less than 3 then fire “IllegalNumberOfArguments”
b. If the operator is not an Arithmetic operator, throw “InvalidOperatorException”.
c. If result is –ve, then throw “NegativeResultException”*/




class IllegalNumberOfArguments extends Exception
{
	IllegalNumberOfArguments(String ch)
	{
		System.out.println(ch);
	}	
}

class InvalidOperatorException extends Exception
{
	InvalidOperatorException()
	{
		System.out.println("Invalid Operator");
	}	
}

class NegativeResultException extends Exception
{
	NegativeResultException()
	{
		System.out.println("Negative Result");
	}	
}


class Maths
{
	public static void main(String arg[])
	{
		try
		{
			int c=arg.length;
			if(c<3)
			{
				throw new IllegalNumberOfArguments("Number Of Arguments are less than 3");
			}
			int a=Integer.parseInt(arg[0]);
			int b=Integer.parseInt(arg[1]);
			String op=arg[2];			
			float res;
			
			switch(op)
			{
				case "+":res=a+b;
					 break;
				case "-":res=a-b;
					 break;
				case "*":res=a*b;
					 break;
				case "/":res=a/b;
					 break;
				default: throw new InvalidOperatorException();	
			}
			/*if(op.equals("+"))
			{
				res=a+b;
			}
			else if(op.equals("*"))
			{
				res=a*b;
			}
			else if(op.equals("/"))
			{
				res=a/b;
			}
			else if(op.equals("-"))
			{
				res=a-b;
			}
			else
			{
				throw new InvalidOperatorException();
			}*/

			if(res<0)
			{
				throw new NegativeResultException();
			}
			else
			{
				System.out.println("Result : "+res);
			}
		}
		catch(IllegalNumberOfArguments e)
		{
		}
		catch(InvalidOperatorException e)
		{
		}
		catch(NegativeResultException e)
		{
		}
	}
}
