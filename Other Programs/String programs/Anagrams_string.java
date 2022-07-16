import java.util.*;
public class Anagrams_string {
    public static void main(String[] args) {
    
    int a=1432;
    getReverse(a);
    
    
    }
    static void getReverse(int num)
    {
        int []arr=new int[4];
        int rev=0;
        int i=0;
        while (num>0)
        {
            int rem=num%10;
            arr[i]=rem;
            num=num/10;
            i=i+1;

        }
        for(int x=0;x<4;x++)
        {
            System.out.println(arr[x]);
        }
        Arrays.sort(arr);
        System.out.println("after sorting the array is");
        for(int x=0;x<4;x++)
        {
            System.out.println(arr[x]);
        }
    }
}
