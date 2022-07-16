import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<ArrayList> list=new ArrayList<ArrayList>();
        for(int i=1;i<=n;i++){
            int d=sc.nextInt();
            ArrayList<Integer> newlist=new ArrayList<Integer>();
            for(int j=1;j<=d;j++){
                int ele=sc.nextInt();
                newlist.add(ele);
            }
            list.add(newlist);
        }
        int q=sc.nextInt();
        for(int i=1;i<=q;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(list.get(x).get(y));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }

        }

    }
}
