/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class Lucky_String {
    public static void main(String args[] ) //throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int min=1000;

        String str=sc.next();
        char []ch=str.toCharArray();
        int p2=ch.length/2;

        int p1=0;
        int count=0;
        while(p1<ch.length/2 && p2<ch.length)
        {
            if(Character.getNumericValue(ch[p1])<=Character.getNumericValue(ch[p2]))
            {
                count++;
                System.out.println(ch[p1]+" is less than "+ch[p2]);
            }
            p1++;
            p2++;
        }
        System.out.println(count);
        if(count<min)
            min=count;
        
        p2=ch.length/2;

        p1=0;
        count=0;
        while(p1<ch.length/2 && p2<ch.length)
        {
            if(ch[p1]>=ch[p2])
                count++;
            p1++;
            p2++;
        }
        System.out.println(count);
        if(count<min)
            min=count;
        

        p2=ch.length/2;

        p1=0;
        count=0;
        while(p1<ch.length/2 && p2<ch.length)
        {
            if(ch[p1]!=ch[p2])
                count++;
            p1++;
            p2++;
        }
        System.out.println("third "+count);
        if(count<min)
            min=count;
        System.out.println(min);

    }
}
