/*
Write a program to accept ‘n’ elements from the user and print all prime numbers. 
Use suitable collection which do not accept duplicate elements.
*/

import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class LinkPrime 
{
    public static void main(String s[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        
        LinkedHashSet lhs=new LinkedHashSet();
        
        int num;
        
        out.println("Enter the numbers...Press 0 to submit");
        
        while((num=sc.nextInt())!=0)
        {
            int flag=0;
            for(int i=2;i<num;i++)
            {
                if(num%i == 0)
                {
                    flag=1;
                }
            }
            
            if(flag==0)
            {
                lhs.add(num);
            }
        }
        
        out.println("Prime Numbers are : \n"+lhs);
    }
}
