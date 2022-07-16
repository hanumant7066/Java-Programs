class SpiralClockWise // Producing wrong output
{
	static int b=3;
	static int a=4;
	static void printSpiral(int R,int C,int[][]arr) // 100% working for any mxn matrix
	{
		int col=0,row=0,i;
		int cnt=0;
		int total=R*C;
		while(row<R && col<C)
		{
			if(cnt==total)
				break;
			for(i=col;i<C;i++){
				System.out.print(arr[row][i]+" ");
				cnt++;
			}
			row++;
			
			if(cnt==total)
				break;
			if(row<R)
			{
				for(i=row;i<R;i++){
					System.out.print(arr[i][C-1]+" ");
					cnt++;
				}
				C--;
			}
			if(cnt==total)
				break;
			if(col<C)
			{
				for(i=C-1;i>=col;i--)
				{
					System.out.print(arr[R-1][i]+" ");
					cnt++;
				}
				R--;
			}
			if(row<R)
			{
				for(i=R-1;i>=row;i--)
				{
					System.out.print(arr[i][col]+" ");
					cnt++;
				}
				col++;
			}
		}
	}
	public static void main(String[] args) {  
		int[][] arr={
					{1,2,3,4},
					{5,6,7,3},
					{9,10,11,2}};
				//	{13,14,15,16}};

		printSpiral(b,a,arr);
	}
}