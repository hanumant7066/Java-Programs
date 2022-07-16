import java.util.Scanner;
class Identity_matrix
{
	public void checkIdentity(int [][] arr,int m, int n)
	{
		boolean b=true;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j && arr[i][j]!=1)
				{
					//if(arr[i][j]!=1)
					
						b=false;
						break;
					
				}
				else if(arr[i][j]!=0 && i!=j)
				{
					b=false;
					break;
				}
			}
		}
		if(b==true)
			System.out.println("Given matrix is identity matrix");
		else
			System.out.println("Given matrix is not identity matrix");

	}
	public static void main(String[] args) {
		Identity_matrix obj=new Identity_matrix();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3x3 matrix to check identity or not");
		int m=3,n=3;
		int [][]matrix=new int[m][n]; 

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}

		}
		obj.checkIdentity(matrix,m,n);
	}
}