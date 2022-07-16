import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        int arr[]=new int[N];
        for(int i=0;i<N;i++);
        {
            arr[i]=sc.nextInt();
        }
        
        if(arr.length>=4)
        {
            Arrays.sort();
        
        int count=0,len=arr.length-1;
        float mult=1;
        while(count!=4)
        {
           mult*=arr[len];
           len--;
           count++;
        }
        System.out.println(mult);
        
        }
        else
            System.out.println("Invalid");
    }
}
