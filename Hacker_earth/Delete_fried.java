import java.util.*;

class Delete_fried
{
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many friends you have ");
		System.out.println("enter the friends Popularity ");
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("friends popularity is "+list);
		System.out.println("How many friends you want to delete ");
		int del=sc.nextInt();

		int current_delete=0;
			int a=0;

		while(current_delete!=del || a<=0)
		{
			Object intarr[]=list.toArray();
			for(int i=0;i<list.size()-1;i++)
			{
				if((Integer)intarr[i]<(Integer)intarr[i+1])
				{
					list.remove(intarr[i]);
					current_delete++;
				}
				if(current_delete==del ||a>0 )
				{
					a++;
					break;
				}

			}
			System.out.println("after removing one phase list is "+list);
			
		}
		System.out.println("Remaining friends list is "+list);

	}
}