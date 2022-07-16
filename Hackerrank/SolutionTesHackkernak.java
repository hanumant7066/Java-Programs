
import java.util.*;
class TestClass {
    static int getsum(int num){
        if(num<10)
            return num;
        else
        {
            int sum=0;
            while(num>0){
                int rem=num%10;
                sum+=rem;
                num=num/10;
            }
            return getsum(sum);
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int []arr=new int[N];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int sumarr[]=new int[N];
        for(int i=0;i<arr.length;i++){
            int smallsum=getsum(arr[i]);
            sumarr[i]=smallsum;
        }
        Arrays.sort(sumarr);
        for(int i=0;i<Q;i++){
            int qtype=sc.nextInt();
            int K=sc.nextInt();
            
            if(qtype==1){
                int sum=0;
                int count=0;
                int last=sumarr.length-1;
                while(true){
                    sum+=sumarr[last];
                    last--;
                    count++;
                    if(K==count)
                        break;
                }
                System.out.println(sum);
            }
            else{
                int sum=0;
                int count=0;
                int last=0;
                while(true){
                    sum+=sumarr[last];
                    last++;
                    count++;
                    if(K==count)
                        break;
                }
                System.out.println(sum);

            }
        }



    }
}
