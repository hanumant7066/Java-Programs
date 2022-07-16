import java.util.Scanner;
class FriendDelete
{
	public static void main(String[] args) {
		System.out.println("enter the no. of friends in the list");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []arr=new int[N];
		System.out.println("enter the friends popularity");

		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the no. of friends to delete");
		int del=sc.nextInt();

		int cnt1=0,cnt2=1;
		int counter=0;

		while(true)
		{
			while(cnt1<arr.length && cnt2<arr.length)
			{
				if(arr[cnt1]<arr[cnt2])
				{
					System.out.println("i compaired "+arr[cnt1]+" and "+arr[cnt2]);
					arr[cnt1]=Integer.MAX_VALUE;
					cnt1++;
					cnt2++;
					counter++;
				}
				else
				{
					if(arr[cnt1]==Integer.MAX_VALUE ){
						cnt1++;
						cnt2++;
					}
					else if(arr[cnt2]==Integer.MAX_VALUE && arr[cnt1]!=Integer.MAX_VALUE){
						cnt2++;
					}else{
						cnt1++;
						cnt2++;
					}
				}
				if(counter==del){
					break;
				}
			}
			if(counter==del)
					break;
			else{
				cnt1=0;
				cnt2=1;
			}	

		}
		for(int x:arr){
			if(x==Integer.MAX_VALUE)
				continue;
			else
				System.out.print(x+" ");
		}


	}
}