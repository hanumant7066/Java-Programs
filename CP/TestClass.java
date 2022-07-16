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
class TestClass {
    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashSet<Integer> A=new HashSet<Integer>();
        for(int i=0;i<N;i++)
            A.add(sc.nextInt());

        int M=sc.nextInt();
         HashSet<Integer> C=new HashSet<Integer>();
        for(int i=0;i<N;i++)
            C.add(sc.nextInt());

        ArrayList<Integer> list=new ArrayList<Integer>();
        Object []a=A.toArray();
        Object []c=C.toArray();

        int n=1;
        while(n<=100)
        {
            int cnt=0;
            for(int i=0;i<A.size();i++)
            {
                int num=(Integer)a[i];
                if(C.contains(num+n))
                {
                    continue;
                }
                else{
                    n++;
                    cnt++;
                    break;
                }
                    
            }
            if(cnt==0){
                list.add(n);
                n++;
            }
        }
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }


    }
}
