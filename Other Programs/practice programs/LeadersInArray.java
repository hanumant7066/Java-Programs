public class LeadersInArray
{
	void printLeaders(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			int j;
			for(j=i+1;j<size;j++)
			{
				if(arr[i]<=arr[j])
				{
					break;
				}
			}
			if(j==size)
				System.out.println(arr[i]+" ");
		}
	}
	public static void main(String []args)
	{
		LeadersInArray lead=new LeadersInArray();
		int arr[]=new int[]{16,17,4,5,3,2};
		int n=arr.length;
		lead.printLeaders(arr,n);
	}
}