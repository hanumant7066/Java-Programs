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
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++)
        {
           int N=sc.nextInt();
           if(N%6==0 || N%6==1)
           {
               if(N%6==0){
                   N+=1;
                System.out.println(N+" WS");
               }
               else{
                   N+=11;
                   System.out.println(N+" WS");
               }
           }
           else if(N%6==2 || N%6==5)
           {
               if(N%6==2){
                   N+=9;
                System.out.println(N+" MS");
               }
               else{
                   N+=3;
                   System.out.println(N+" MS");
               }
           }
           else if(N%3==0 || N%4==1)
           {
               if(N%6==3){
                   N+=7;
                System.out.println(N+" AS");
               }
               else{
                   N+=5;
                   System.out.println(N+" AS");
               }
           }
        }        

    }
}
