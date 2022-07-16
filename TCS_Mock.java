import java.util.Scanner;
import java.util.*;
class TCS_Mock
{
    static void findFirstFourLarge(int []arr)
    {
        int mult=1;
        int count=0;
        while(count!=4)
        {
            //int maxnumindex=0;

            for(int i=0;i<arr.length-num-1;i++)   // 4,5,3,8,9
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            count++;

        }
        int len=arr.length;
        mult=arr[len-1]*arr[len-2]*arr[len-3]*arr[len-4];

        System.out.println("product  is "+mult);
        

    }
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        if(arr.length>=4)
        {
            findFirstFourLarge(arr);
           /* Arrays.sort(arr);
        
        int count=0,len=arr.length-1;
        float mult=1;
        while(count!=4)
        {
           mult*=arr[len];
           len--;
           count++;
        }
        System.out.println(mult);*/
        
        }
        else
            System.out.println("Invalid Input");
    }
}
