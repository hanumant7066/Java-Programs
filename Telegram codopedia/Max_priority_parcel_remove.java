import java.util.*;
class Max_priority_parcel_remove
{
	static void getHighPriorityParcel(int []arr,int N,int K)
	{
		PriorityQueue<Integer> list=new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i=0;i<K-1;i++)
		{
			list.add(arr[i]);         // 10
		}
		for(int i=K-1;i<arr.length;i++)
		{
			int num=arr[i];
			list.add(num);
			System.out.print(list.remove()+" ");
		}

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();   // No. of parcels are going to come their priority
		int arr[]=new int[N];
		int K=sc.nextInt();   // Maximum no. of parcel can be kept at a time at store

		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		getHighPriorityParcel(arr,N,K);
	}
}