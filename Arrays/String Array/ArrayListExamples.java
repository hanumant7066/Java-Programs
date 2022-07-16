import java.util.*;
//import java.util.ArrayList;
class ArrayListExamples
{
	static void printMatrix(String[][]arr,int N)
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void swapRow(String [][]arr,int N, int row1,int row2)
	{
		String s1=arr[row1][0];
		String s2=arr[row1][1];
		String s3=arr[row1][2];

		arr[row1][0]=arr[row2][0];
		arr[row1][1]=arr[row2][1];
		arr[row1][2]=arr[row2][2];

		arr[row2][0]=s1;
		arr[row2][1]=s2;
		arr[row2][2]=s3;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Student:");
		int N=sc.nextInt();

		//ArrayList list=new ArrayList();


		System.out.println("Enter three values on a single line\n1.Name\n2.Scholor Number \n3.Marks");
		String [][]arr=new String[N][3];
		int row=0;
		for(int i=0;i<N;i++)
		{
			Scanner sc1=new Scanner(System.in);
			String str=sc1.nextLine();
			String []s=str.split(" ");
			for(int j=0;j<s.length;j++)
			{
				String temp=s[j];
				arr[row][j]=temp;
			}
			row++;
		}
		//System.out.println(list);
		for(int fr=0;fr<N;fr++)
		{
			for(int sr=fr+1;sr<N;sr++)
			{
				if(Integer.parseInt(arr[fr][2]) < Integer.parseInt(arr[sr][2]))
				{
					swapRow(arr,N,fr,sr);
				}
				else if(Integer.parseInt(arr[fr][2]) == Integer.parseInt(arr[sr][2]))
				{
					if(arr[fr][0].compareTo(arr[sr][0])>0)
					{
						swapRow(arr,N,fr,sr);
					}
					else if(arr[fr][0].equals(arr[sr][0]))
					{
						if(Integer.parseInt(arr[fr][1]) < Integer.parseInt(arr[sr][1]))	
						{
							swapRow(arr,N,fr,sr);
						}
					}
				}
			}
		}

		//swapRow(arr,N,0,1);
		printMatrix(arr,N);
	}
}