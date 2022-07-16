class VowelException extends Exception
{
    String s1;
    public VowelException(String s1)
    {
        this.s1=s1;
        System.out.println(s1);
    }
}
class BlankException extends Exception
{
	String s2;
	public BlankException(String s2)
	{
		this.s2=s2;
		System.out.println(s2);
	}

}
class ExitException extends Exception
{
    String s3;
    public ExitException(String s3)
    {
        this.s3=s3;
        System.out.println(s3);
    }

}

public class Test
{
	private static int count=0;
	private static char ch;
	private static int c;
    public static void main(String []args)
    {   
      try{
            
            String s=args[0];
	 c=args.length;
            ch=s.charAt(0); 
	    
		checkblank(ch);
          } catch(Exception e){

                     System.out.println("exception:"+e);
		count++;
                    }
           
   

        try
        {
            checkxy(ch);
        }catch (Exception n)
        {
            System.out.println("Exception catched: "+n);
	    count++;
        }
        try
        {
            checkvowel(ch);
        }catch(Exception n)
        {
            System.out.println("Exception catched:"+n);
		count++;
        }
	if(count==0)
	{
		System.out.println("valid character");
	}

    }
    static void checkxy(char ch) throws ExitException
    {
        if(ch=='x')
        {
            throw new ExitException("Exception occured(exit): program finished");
        }

    }
    static void checkvowel(char ch) throws VowelException
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            throw new VowelException("vowel exception occured:");
        }
    }
    static void checkblank(char ch) throws BlankException
    {
        if(ch==' ')
        {
            throw new BlankException("blank exception occured:");
        }
    }

}
