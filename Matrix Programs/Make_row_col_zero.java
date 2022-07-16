import java.util.*;
class Make_row_col_zero
{
	static int R=3;
	static int C=3;
	static void makerowcolzero(int row,int col,int[][]copymat)
	{
		for(int i=0;i<C;i++){
			copymat[row][i]=0;
		}

		for(int i=0;i<R;i++){
			copymat[i][col]=0;
		}
	}
	public static void main(String[] args) { 
		
		int [][]mat={{1,1,1},
					 {0,7,9},
					 {1,5,8}};

		int [][]copymat=new int[R][C];
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				copymat[i][j]=mat[i][j];
			}
		}

		// int [][]copymat=Arrays.clone(mat);
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				if(mat[i][j]==0)
					makerowcolzero(i,j,copymat);
				
			}
			
		}
		System.out.println("output matrix is ");
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				System.out.print(copymat[i][j]+" ");
			}
			System.out.println();
		}
	}
}