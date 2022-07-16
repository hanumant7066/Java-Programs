import java.util.*;
class NCR_Question
{
	public static void main(String[] args) throws Exception
	{
			System.out.println(" Enter the size of weight array ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println(" Enter the size of safe array");
			int m=sc.nextInt();
			System.out.println(" Enter the weights values ");
			int []weight=new int[n];
			for(int i=0;i<n;i++)
			{
				weight[i]=sc.nextInt();
			}
			System.out.println("Enter the values of safe array");
			ArrayList<Integer> safe=new ArrayList<Integer>();
			for(int i=0;i<m;i++)
			{
				int ele=sc.nextInt();
				safe.add(ele);
			}
			int count=0;

			for(int i=0;i<n;i++)
			{
				Iterator lir=safe.iterator();
				while(lir.hasNext())
				{
					//Object num=lir.next();
					int num1=(Integer)lir.next();
					if(num1>weight[i]){
						count++;
						lir.remove();
						break;

					}
				}
			}
			System.out.println("count is "+count);





				
	}
}