
import java.util.Scanner;

public class Decimal_to_binary_constructor
{
    int n,num12;
    public Decimal_to_binary_constructor()
    {
        n=7;
    }
    public Decimal_to_binary_constructor(int n1)
    {
        n=n1; num12=n;
    }

    void decimaltobinary()
    {
        String str_rem=" ";
        if(n==0)
        {
            System.out.println("Binary of 0 is : 0");
        }
        if(n==1)
        {
            System.out.println("Binary of 1 is : 1");
        }else {
            while (n > 0) {
                if(n==1)
                {
                    str_rem=str_rem+1;
                    String rev=" ";
                    for(int i=str_rem.length()-1;i>=0;i--)
                    {
                        rev=rev+str_rem.charAt(i);
                    }
                    System.out.println("binary of "+num12+" is  :"+rev);
                    return;
                }
                int rem = n % 2;
                str_rem = str_rem + rem;
                n = n / 2;
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("enter he number to convert decimal to binary: ");
	int n1=obj.nextInt();
        Decimal_to_binary_constructor obj=new Decimal_to_binary_constructor(n1);
        obj.decimaltobinary();

    }
}
